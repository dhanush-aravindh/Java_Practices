package com.Java_Intro;


// for (int; condition; incr/decr)
// {
//   code to be executed
//}
public class ForLoop {
    public static void main(String[] args){
        for (int i = 1 ; i <= 10; i++) {
            SquareCal(i);
        }
// Print multiplication table for seven
        for (int k = 1;k <=30;k++){
            System.out.println("7 X "+ k + " = "+7*k);
        }
        // print table 8 in reverse order
        for(int h = 10;h >= 1 ; h--) {
            System.out.println("8 X "+ h +" = "+ 8*h);

        }
        SquareCal(1);
        SquareCal(2);
        SquareCal(3);
        SquareCal(4);
        SquareCal(5);

    }


    public static void SquareCal(int i){
        int j = i*i;
        System.out.println("The Square of " + i + " is: "+j);


    }

}

