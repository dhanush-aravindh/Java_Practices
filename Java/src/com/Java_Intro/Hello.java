package com.Java_Intro;

// Project Should be a unified name or uniword and there should be no space between the word In order to show difference
// Between two word we should use Captital Letters to distinguish the words
public class Hello{
    public static void main (String[] args){
        System.out.println("com.Operators.Hello World");
        System.out.println("Dhanush Aravindhan");
        System.out.println(22);
        System.out.println("I am an Indian" + " I am from TamilNadu");
        System.out.println("===================================================================================");
        System.out.println("com.Operators.Hello World! \n" +
                "\n" +
                "Prepinsta is Awesome\n" +
                "\n" +
                "Welcome to the Java course\n" +
                "\n" +
                "If you want to learn Java in depth, complete this playlist.");
        System.out.println("===================================================================================");
        System.out.printf("com.Operators.Hello World!\n\nPrepinsta is Awesome\n\nWelcome to the Java course\n\nIf you want to learn Java in depth, complete this playlist.%n");
        System.out.println("===================================================================================");
        System.out.println("""
                com.Operators.Hello World!

                Prepinsta is Awesome

                Welcome to the Java course

                If you want to learn Java in depth, complete this playlist.""");
        System.out.println("===================================================================================");
        System.out.println(String.join("\n", "com.Operators.Hello World!\n", "Prepinsta is Awesome\n", "Welcome to the Java course\n", "If you want to learn Java in depth, complete this playlist."));
        System.out.println("===================================================================================");
        System.out.println(new StringBuilder().append("com.Operators.Hello World!\n").append("\n").append("Prepinsta is Awesome\n").append("\n").append("Welcome to the Java course\n").append("\n").append("If you want to learn Java in depth, complete this playlist.").toString());
    }
}
// Java Programs have keywords which has specific meaning and a defined order in which they can be used
// Order: Identifier/ Access modifier + class + class_name --> This is the order of writing a java class
// We write the programs using specific set of rules, by using a combination of the keywords and other parameters which finally form a java program
// Keywords are case-sensitive. For example: public and Public are two different keywords.
// public abd class are two different java keywords which we used in our hello world program.
// The public keyword is called the access modifier.
// class keyword is used to define a class with the name following keyword. com.Java_Intro.Hello in our case.
// The curly braces are defining the class body.
// The code that we write between the braces is called the Part of the class.
// Method --> It is a collection of statements that performs an action.
// In our case we are going to print the statement.
// Main Method--> It is the special method which java looks for in running a program. It is called the entry point. Every function should have the main method
// to start running a program
// What is Method? It is a collection of statements that performs an operation
// Main method --> It is a special method which java looks for when running a program. It is called the entry point as well
// Public is the access modifier
// static is a java keyword which we will talk about in this course
// void is a java keyword used to indicate that the method will not return anything
// The left and the right parenthesis in a method declaration are mandatory and can include one or more parameters, to
// pass any value or info to the method.
// code block --> It is used to define a block of code. We must have one in the method declaration ,and it is where we
// perform certain tasks.
// Statement is a command to be executed can include one or more expressions.
// sout --> Shortcut for System.out.println() function