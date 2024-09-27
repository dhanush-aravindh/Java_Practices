package com.Java_Intro;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) != 0)||((year == 2000))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void NumberOfDays(int month , int year){
        if (month < 1 || month > 12){
            System.out.println(-1);

        }
        if (year < 1 || year > 9999){
            System.out.println(-1);
        }
        switch(month){
            case 1:
                System.out.println("January " + year + "has 31 days");
                break;
            case 2:
                System.out.println("February " + year + " has " + (isLeapYear(year)? "29 days":"28 days"));
                break;
            case 3:
                System.out.println("March " + year + "has 31 days");
                break;
            case 4:
                System.out.println("April " + year + "has 30 days");
                break;
            case 5:
                System.out.println("May " + year + "has 31 days");
                break;
            case 6:
                System.out.println("June " + year + "has 30 days");
                break;
            case 7:
                System.out.println("July " + year + "has 31 days");
                break;
            case 8:
                System.out.println("August " + year + "has 31 days");
                break;
            case 9:
                System.out.println("September " + year + "has 30 days");
                break;
            case 10:
                System.out.println("October " + year + "has 31 days");
                break;
            case 11:
                System.out.println("November " + year + "has 30 days");
                break;
            case 12:
                System.out.println("December " + year + "has 31 days");
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Enter the month: " + month);
        int year = sc.nextInt();
        System.out.println("Enter the year: " + year );
        NumberOfDays(month,year);



    }
}
