package com.Java_Intro;

import java.util.Scanner;


public class MultipleChecker {

    public static boolean hasEqualProduct(int x1,int x2,int x3){
        if (x1 * x2 == x3){
            return true;
        }
        else{
            return false;
        }

    }





    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        System.out.println("X1: " + x1);

        int x2 = sc.nextInt();
        System.out.println("X2: " + x2);

        int x3 = sc.nextInt();
        System.out.println("X3: " + x3);

        System.out.println(hasEqualProduct(x1,x2,x3));
    }
}
