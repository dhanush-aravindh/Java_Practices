package com.Java_Intro;
import java.util.Scanner;

public class WeightConvertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight :");
        double weightKgs = sc.nextDouble();
        System.out.println("Enter weight:" + weightKgs + " Kgs");

        weightConvertion(weightKgs);

    }
    public static void weightConvertion(double weights){
        // 1kg = 1000 grams
        double weightGrams = weights * 1000;
        double weightMilgrams = weights * 1000000;
        System.out.println("Weight in Grams:" + weightGrams);
        System.out.println("Weight in Milligrams:" + weightMilgrams);


    }
}
