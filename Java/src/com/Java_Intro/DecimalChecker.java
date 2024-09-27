//Write a method areEqualByFiveDecimalPlaces with three parameters of type double.The method should return boolean and it needs to return true if three double numbers are the same up to five decimal places.Otherwise, return false.
//
//        Example
//
//        areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up to 5 decimal places.
//        areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up to 5 decimal places.
//
package com.Java_Intro;
import java.util.Scanner;


public class DecimalChecker {

    public static boolean areEqualByFiveDecimalPlaces(double x1,double x2,double x3) {

        x1 = Math.round(x1 * 100000) ;
        x2 = Math.round(x2 * 100000) ;
        x3 = Math.round(x3 * 100000);

        return (x1 == x2) && (x2 == x3);



    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        System.out.println("First Decimal Number X1: " + x1);
        double x2 = sc.nextDouble();
        System.out.println("Second Decimal Number X2: " + x2);
        double x3 = sc.nextDouble();
        System.out.println("Third Decimal Number X3: "+ x3);
        System.out.println(areEqualByFiveDecimalPlaces(x1,x2,x3));;


    }
}
