package com.Java_Intro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public interface EditableDiGraph {
    void addNode(int id, String character);
    void addEdge(int fromId, int toId);

}
class BetterDiGraph implements EditableDiGraph {
    private Map<Integer, String> nodes;
    private Map<Integer, Set<Integer>> edges;

    public BetterDiGraph() {
        nodes = new HashMap<>();
        edges = new HashMap<>();
    }

    @Override
    public void addNode(int id, String character) {
        nodes.put(id, character);
    }

    @Override
    public void addEdge(int fromId, int toId) {
        edges.computeIfAbsent(fromId, k -> new HashSet<>()).add(toId);
    }

    public Map<Integer, String> getNodes() {
        return nodes;
    }

    public Map<Integer, Set<Integer>> getEdges() {
        return edges;
    }
}

interface TopologicalSort {
    List<Integer> sort();
}

class IntuitiveTopological implements TopologicalSort {
    private BetterDiGraph graph;

    public IntuitiveTopological(BetterDiGraph graph) {
        this.graph = graph;
    }

    @Override
    public List<Integer> sort() {
        List<Integer> ordering = new ArrayList<>();
        Map<Integer, Set<Integer>> edges = new HashMap<>(graph.getEdges());

        while (!edges.isEmpty()) {
            Integer nodeWithZeroInDegree = findNodeWithZeroInDegree(edges);
            if (nodeWithZeroInDegree == null) {
                throw new RuntimeException("Graph contains a cycle!");
            }

            ordering.add(nodeWithZeroInDegree);
            edges.remove(nodeWithZeroInDegree);
            removeNodeFromEdges(edges, nodeWithZeroInDegree);
        }

        return ordering;
    }

    private Integer findNodeWithZeroInDegree(Map<Integer, Set<Integer>> edges) {
        Set<Integer> allDependentNodes = new HashSet<>();
        for (Set<Integer> nodes : edges.values()) {
            allDependentNodes.addAll(nodes);
        }

        for (Integer node : edges.keySet()) {
            if (!allDependentNodes.contains(node)) {
                return node;
            }
        }

        return null;
    }

    private void removeNodeFromEdges(Map<Integer, Set<Integer>> edges, Integer node) {
        for (Set<Integer> nodes : edges.values()) {
            nodes.remove(node);
        }
    }
}
class LastNameMain {
    public static void main(String[] args) {
        // Step 1: Load data-kanji.txt and populate the hashtable
        Map<Integer, String> characterMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data-kanji.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || line.trim().isEmpty()) {
                    continue;  // Skip comment lines or empty lines
                }
                String[] parts = line.split("\t");
                int id = Integer.parseInt(parts[0]);
                String character = parts[1];
                characterMap.put(id, character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Load data-components.txt and build the graph
        BetterDiGraph graph = new BetterDiGraph();
        try (BufferedReader br = new BufferedReader(new FileReader("data-components.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || line.trim().isEmpty()) {
                    continue;  // Skip comment lines or empty lines
                }
                String[] parts = line.split("\t");
                int fromId = Integer.parseInt(parts[0]);
                int toId = Integer.parseInt(parts[1]);
                graph.addNode(fromId, characterMap.get(fromId));
                graph.addNode(toId, characterMap.get(toId));
                graph.addEdge(fromId, toId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Perform topological sorting using IntuitiveTopological
        IntuitiveTopological topologicalSort = new IntuitiveTopological(graph);
        List<Integer> ordering = topologicalSort.sort();

        // Step 4: Display the characters in the ordering
        for (Integer id : ordering) {
            String character = characterMap.get(id);
            System.out.println(character);
        }
    }
}








