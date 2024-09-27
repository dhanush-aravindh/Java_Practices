package com.Java_Intro;

public class ControlStatements {
    public static void main(String[] args) {
        // if-else statement
        // The Java if-else statement also tests the condition.
        // It executes the if block if condition is true otherwise else block is executed.
        // 100 - S
        // 91 to 99 -A
        // 81 to 90 - B
        // 71 to 80 - C
        // Syntax of if else statement
        // if(Condition)
        // {
        //    //code
        // }
        // else
        // {
        //   //code
        // }
        int score = 76;
        if (score >= 100) {
            System.out.println("You scored S grade");
        } else if (score > 90 && score < 100) {
            System.out.println("You scored A grade");
        }
        else if (score > 80 && score < 91) {
            System.out.println("You scored B grade");
        }
        else if (score > 70 && score < 81 ) {
            System.out.println("You scored C grade");
        }
        else{
            System.out.println("You failed");
        }


    }
}
