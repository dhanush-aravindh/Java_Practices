package com.Java_Intro;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfLargestPrimeFactor(10));
    }
    public static int sumOfLargestPrimeFactor (int num)
    {
        int arr[] = new int[num + 1];
        int sum = 0;
        int max = num / 2;

        for (int i = 2; i <= max; i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i * 1; j <= num; j += i)
                    arr[j] = i;
            }
        }

        for (int i = 2; i <= num; i++)
        {
            if (arr[i] != 0)
                sum += arr[i];
            else
                sum += i;
        }
        return sum;
    }
}


