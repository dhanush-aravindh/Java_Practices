package com.Java_Intro;

//import java.sql.SQLOutput;
// Switch Statment test the equality of a variable against multiple values.
// While break, the program continues to the next labeled statement,executing the statements until a break or
// the end of the statement is reached

public class SwitchCase {
    public static void main(String[] args) {
        int my_value = 2;

        switch (my_value){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                System.out.println("Double value of 2 is " + 2*my_value);
                break;
            case 3:
                System.out.println("Value is 3");
                break;
                // Binding of Cases
            case 4: case 5: case 6:
                System.out.println("Value can be 4 or 5 or 6");
                break;
            default: // It is like else statement in if-else statement
                System.out.println("A Default Value");
                break;

        }

//        if (my_value == 1){
//            System.out.println("Value is 1");
//        }
//        else if (my_value == 2){
//            System.out.println("Value is 2");
//
//        }
//        else{
//            System.out.println("More than 2");
//        }
        char my_char_value = 'A';
        switch(my_char_value){
            case 'A':
                System.out.println("the value is A");
                break;
            case 'B':
                System.out.println("The value is B");
                break;
            default:
                System.out.println("Unknown value");
                break;
        }
        String dayoftheweek = "SUnDay"; // String values are case sensitive and use them properly
        switch (dayoftheweek.toLowerCase()){
            case "sunday":
                System.out.println("today is sunday");
                break;
            case "monday":
                System.out.println("today is monday");
                break;
            default:
                System.out.println("Unknown day");
                break;


        }

    }

}
