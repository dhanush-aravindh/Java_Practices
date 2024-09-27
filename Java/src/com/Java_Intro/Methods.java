package com.Java_Intro;

import java.sql.SQLOutput;

public class Methods {
    //int length = 10;
    //int breadth = 20;
    public static void myDetails(){
        String myName = "My Name is Dhanush";
        int age = 27;
        double height = 6.1;
        System.out.println(myName);
        System.out.println("Age is: " + age );
        System.out.println("Height is: " + height );
    }
    public static void PerimerterOfRect(int length,int breadth){
        double perimeter = 2*(length+breadth);
        System.out.println("The Perimeter is: " + perimeter);

    }
    public static double SpeedofObject(double distance,double time) {
        if (distance == 100) {
            double speed = (distance / time);
            return speed;
        } else {
            return 0;
        }
    }


        public static void main (String[] args){
            //Method is an equivalent of functions in C and C++
            // Method makes the code more readable,faster
            // Method:
            // A method is a block of code or collection of statements
            // or a set of code grouped together to perform a certain task or operation.
            // Methods are used to achieve the reusability of code.
            // Methods also provides the easy modification and readability of code.
            // If we have mentioned a return type apart from void in the method then we should provide the return statement in the method;
            myDetails();
            System.out.println("This is test");
            myDetails();
            System.out.println("Test 2");
            myDetails();
            PerimerterOfRect(10, 20);
            PerimerterOfRect(30, 20);
            SpeedofObject(45.63, 0.789);
            double topspeed = SpeedofObject(200, 20);
            double x = 40 * topspeed;
            System.out.println(x);

        }
    }



