package com.Java_Intro;
import java.util.Scanner;
public class YearAndDayCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long minutes = sc.nextLong();
        printYearsAndDays(minutes);

    }
    public static void printYearsAndDays(long min) {

        if (min < 0) {
            System.out.println("Invalid Value");
            ;
        }


        long years = min / 525600;
        long minutesRemaining = (min - (years * 525600));
        long daysRemaining = minutesRemaining / 1440;
        System.out.println(min + " min = " + years + " y and " + daysRemaining + " d");
    }

}
