package com.Java_Intro;

import java.util.Scanner;

public class EqualityChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        printEqual(num1,num2,num3);


    }
    public static void printEqual(int n1,int n2, int n3){

//        if (n1 < 0 && n2 < 0 && n3 <0) {
//            System.out.println("Invalid Value");
//
//        }
//        else {
//
//            if (n1 == n2 && n2 == n3 && n3 == n1) {
//                System.out.println("All the numbers are equal");
//
//            }
//            else {
//                System.out.println("Neither all are equal or different.");
//
//            }

        if((n1 < 0) || (n2<0 ) || (n3 < 0)){
            System.out.println("Invalid Value");
        }
        else if(n1 == n2 && n1 == n3 && n2 == n3){
            System.out.println("All numbers are equal");
        }
        else if(n1 != n2 && n1 != n3 && n2 != n3){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
        }

    }

