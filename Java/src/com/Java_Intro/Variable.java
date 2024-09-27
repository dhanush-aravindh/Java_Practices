package com.Java_Intro;

// While defining a variables we need to be specific about the data types, give a variable name
// We can also write an expression to initialise the variable with a value;
// A statement is needed to declare the variable by specifying its data type, the variable name, and also set it to some initial value
public class Variable {

    public static void main (String[] args){
        int age = 22;
        String name = "Dhanush";
        System.out.println(name +" "+  age);
        int firstNumber = 10;
        int second_number =20;
        System.out.println("firstNumber:"+ firstNumber +"\n" +"SecondNumber: "+second_number);
        int a = 25;
        int b = 30;
        int c = a+b;
        System.out.println("a:"+ a + "\n"+ "b:"+b +"\n" + "c:" + c);
        int d = a -c;
        System.out.println("d:"+d);
        int num = (a*5)+(b*4)+((c*a)+(c-a));
        System.out.println(num);
        int sum = num - d;
        System.out.println("sum:" + sum);
        int x = 20;
        int y = x+25;
        int z = y+30;
        int sum1 = x+y+z;
        System.out.println(x +" "+y +" "+z+ " "+ sum1);


    }
}
// String literal: Any set of characters when surrounded by double inverted commas, is called a String literal
// Its value is fixed and cannot be changed.
// Challenge:
// Declare two variables of your choice by assigning them some initial values
// Post that, write statements to print the values of the variables.
