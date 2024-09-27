package com.Java_Intro;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));
        System.out.println(isPerfectNumber(33550336));


    }
    public static boolean isPerfectNumber(int num){
        int sum=0;
        if(num < 1)
        {
            return false;
        }
        else
        {
            for(int i =1;i<num;i++)
            {
                if (num%i == 0)
                {
                    sum = sum+i;
                    if(sum==num)
                    {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
