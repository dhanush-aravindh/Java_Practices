package com.Java_Intro;

public class LogicalOperators {
    public static void main(String[] args){
        int bodyTemp = 97;
        if(bodyTemp >= 97){
            System.out.println("You have fever");
        }

        int a = 50;
        int b = 70;
        if((a<=50) && (b<=75)){
            System.out.println("All good");
        }
        int c=90;
        int d=100;
        if((c>=90) || (d>100)){
            System.out.println("All fame goes to God");
        }
        if((c>90) || (d>100)){
            System.out.println("All fame goes to God");
        }
        if((c>90) || (d>=100)){
            System.out.println("All fame goes to God");
        }

        boolean isitSunday = false;
        if(isitSunday != true){
            System.out.println("Today is not Sunday");
        }
        if(isitSunday == true){
            System.out.println("Today is Sunday");
        }
        if (!isitSunday){
            System.out.println("It is not SUNDAY");
        }
        int mobile_price = 500;
        if(mobile_price == 450 || mobile_price <=500){
            System.out.println("It is under my budget");
        }
        if (mobile_price==500){
            System.out.println("Price of the mobile is 500");
        }
        boolean isitCold = false;
        if(isitCold == true){
            System.out.println("Yes it is cold");
        }
        if(isitCold == false){
            System.out.println("No it is not cold");
        }

        boolean isMarch = false;
        boolean isNoOfDays31 = isMarch ? true : false;
        isMarch = true;
        if(!isNoOfDays31){
            System.out.println("Days are not 31");
        }
        int truckHeight =50;
        boolean TruckAllowed = truckHeight < 50 ? true : false;
        if(TruckAllowed){
            System.out.println("You can cross the bridge");
        }

    }

}
// Logical and operator checks whether the both the conditons are true.
// Logical OR operator checks whether any one of the condition to be true.

