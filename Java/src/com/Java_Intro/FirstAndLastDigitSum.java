package com.Java_Intro;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }
        int first =0;
        int last = number%10;
        number = number/10;
        while (number!=0){
            if (number/10 == 0) {
                first = number % 10;
            }
                number = number/10;
            }
            return first+last;



        }
    }

