package com.Java_Intro;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGCD(25, 15));
        System.out.println(getGCD(12, 30));
        System.out.println(getGCD(9, 18));
        System.out.println(getGCD(81, 153));

    }

    public static int getGCD(int num1, int num2) {
        int greatest =0;
        if(num1 > 10 && num2 > 10){
            for(int i =1;(i<=num1)&&(i<=num2);i++){
                if(num1%i==0 && num2%i==0){
                    greatest =i;
                }

            }
            return greatest;
        }
        return -1;

    }
}

