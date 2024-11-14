package com.demo;
/*
Find the sum of digits of a number
 */
public class _04_sum_of_digits
{
    public static void main(String[] args)
    {
        System.out.println(sumDigits(555));
    }

    public static int sumDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem = n%10;
        int result = rem + sumDigits(n/10);
        return result;
    }
}
