package com.Java_Intro;

import java.util.Scanner;

public class TeenChecker {

    public static boolean hasNotTeen(int x1, int x2, int x3){
        if (x1 >= 13 && x1 <=19){
            return false;
        }
        else if (x2 >= 13 && x2 <= 19){
            return false;
        }
        else if (x3 >= 13 && x3 <= 19){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        System.out.println(hasNotTeen(x1,x2,x3));


    }
}
