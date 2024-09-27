package com.Java_Intro;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
        if (isPalindrome (number))
            System.out.println (number + " is a palindrome number");
        else
            System.out.println (number + " is not a palindrome number");


    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = (reverse * 10 )+ (temp % 10);
            temp = temp / 10;

        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

