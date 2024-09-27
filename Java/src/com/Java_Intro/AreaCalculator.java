package com.Java_Intro;
import java.util.Scanner;
public class AreaCalculator {




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double height = sc.nextDouble();
        double radius = sc.nextDouble();
        area(length);
        area(length,breadth);
        area(breadth,height);
        area(radius);



    }
    public static double area(int length){
         double square_area = length * length;
        System.out.println("The area of Square:" + square_area);
        return 0;
    }
    public static double area(int length,int breadth){
        double rectangle_area = length * breadth;
        System.out.println("The area of Rectangle:" + rectangle_area);
        return 0;
    }
    public static double area(int breadth,double height){
        double triangle_area = 0.5 *(breadth * height);
        System.out.println("The area of Triangle: " + triangle_area);
        return 0;
    }
    public static double area(double radius){
        double circle_area = Math.PI * (radius * radius);
        System.out.println("The area of Circle: " + circle_area);
        return 0;
    }
}
