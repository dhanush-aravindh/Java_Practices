package com.Java_Intro;

public class ConditionalLogic {
    public static void main (String[] args){
        boolean age18 = false;

        if(age18 == true){
            System.out.println("You are eligible to vote");
        }

        if(age18==false){
            System.out.println("You can't vote");
        }

        int num =10;
        if(num ==9)
            System.out.println("Number is 10");
        System.out.println("This is a test");

        if(num!=9){
            System.out.println("Num is 10");
            System.out.println("This is a test");
        }

        boolean a = true;
        if(!a){ // It will simply consider a is true if there is no condition given
            System.out.println("Num is 10");
            System.out.println("This is a test");
        }



    }
}

// Conditional logic:
// Conditional Logic uses specific statements in Java to allow us to check and condition and execute certain code based
// on whether the condition is true or false
// If-then statement is the most basic control flow statement that tell our program to execute a code only if a particular
// test is true
