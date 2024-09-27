package com.Java_Intro;

import java.util.Scanner;

public class OddDigitSum {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(getOddDigitSum(number));
    }
    public static int getOddDigitSum(int num){
        if(num < 0){
            return -1;
        }
        int sum =0;
        while(num!=0)
        {
            if((num%10)%2!=0)
            {
                sum+=num%10;
            }
            num=num/10;

        }
        return sum;
    }
}
