package com.Java_Intro;
// Java while loop is a control flow statement that allows code to be
// executed repeatedly based on the given boolean condition.
// The while loop can be through of as a repeating if statement.
// If the condition evaluates to true then we will execute the body of the loop and go to update the expression.
public class WhileLoop {
    public static void main(String[] args) {
        // int count =1;
        // int count =11; if the initial value value is greater than the conditional value the loop will be executed infinitely
//        while (count != 10){
//            System.out.println("The count value is:"+ count);
//            count++;
//        }
//        for (int i = count;i!=10;i++){
//            System.out.println("The count is:"+count);
//            count++;
//        }
        // infinite while condition loop
//        while(true){
//            if(count==8){
//                break;
//            }
//            System.out.println("The count is: "+count);
//            count++;
//        }
        // do-while loop and infinite while contition loop are same
//        do {
//            System.out.println("The count is:"+count);
//            count++;
//        }while(count < 6);
        // Write a method to predict the odd number if odd return true,else return false
        // in the main method print all the odd numbers from 5 to 30
//        int num = 5;
//        while(num < 31){
//
//            if(odd(num)){
//                System.out.println("The odd number is:" + num);
//
//            }
//            num++;
//        }
//      int num=4;
//      int max = 29;
//      while(num <= max){
//          num++;
//          if(!odd(num)){
//              continue;
//          }
//          System.out.println("The odd number is:"+num);
//      }
//
//    }
//
//    public static boolean odd(int num){
//        if (num < 0){
//            return false;
//
//        }
//        if (num % 2 !=0){//(num %2 ==1)
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
        //Declare a variable n which will store a  number for which,
        // We need to print the multiplication table
        // Declare two variables 'i' and table. 'i' will be our iterator,
        // and table will store the calculated output, which we need to print
//
//        int n = 5;
//        int i = 1;
//        while (i<=10) {// in order to print for uncountable values use i>0
//            int table = n * i;
//            System.out.println(n+"X"+i+"="+table);
//            i++; // if the i value is not incremented the loop becomes infite and prints only 5*1=5 for infinite times
//
//        }

        // Decalare a variable n and store a number in it
        // Declare two more variables rem and sum.
        // Your task is to calculate the sum of the digits of the number
        //'Rem' will be used for storing the digits, and
        // 'sum' will be used to store the sum of those digits,for example
        // N = 12345
        // sum of the digits will be 15.

        int n = 12345;
        int rem;
        int sum = 0;

        do{
            rem = n%10; // 12345 % 10 = 5--> 1234 % 10 = 4 ---> 123 % 10 = 3--> 12 % 10 = 2 --> 1 % 10 = 1
            sum = sum + rem;//0 +5 = 5 ---->   5 + 4 = 9 -----> 9 + 3 = 12 --> 12 + 2 = 14 --> 14 + 1 = 15
            n = n/10; //12345/10 = 1234 ---> 1234 / 10 = 123 ---> 123/10= 12 --> 12/10 = 1 --> 1/10 = 0 --> loop breaking condition
        }while(n!=0);
            System.out.println("The sum the digits:"+sum);
        }

    }

