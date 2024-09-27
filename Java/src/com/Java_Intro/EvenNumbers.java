package com.Java_Intro;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(sumEven(1,100));
        System.out.println(sumEven(-1,100));
        System.out.println(sumEven(10,10));

    }

    public static boolean isEven(int number) {
        if ((number <= 0)) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        }
            return false;



    }

    public static int sumEven(int start, int end) {
        if(end < start){
            return -1;
        }

        if ((start <=0)||(end <= 0)) {
            return -1;
        }

        int sum =0;
        for (int i = start;i<=end;i++)
        {
            if (isEven(i))
            sum = sum+i;
        }

        return sum;
    }

}










