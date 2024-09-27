package com.Java_Intro;

import java.io.Serializable;

public class Factors {

    public static void main(String[] args){
        System.out.println(getFactors(-1));
        System.out.println(getFactors(6));
        System.out.println(getFactors(32));
        System.out.println(getFactors(10));
    }
    public static Serializable getFactors(int num){

        if(num <1){
            System.out.println ("Invalid Value");
        }
        else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");

                }


            }
        }

       return " ";
    }
}
