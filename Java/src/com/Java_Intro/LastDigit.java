package com.Java_Intro;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a >= 10) && (a <= 1000) && (b >= 10) && (b <= 1000) && (c >= 10) && (c <= 1000)) {
            int righta = a % 10;
            int rightb = b % 10;
            int rightc = c % 10;
            if ((righta == rightb) || (rightb == rightc) || (rightc == righta)) {
                return true;
            }

        }
        return false;
    }

}
