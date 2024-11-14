package com.recursion.problem;

public class _07_Digit_Count
{
    public static int countDigit(int num)
    {
        if(num == 0)
        {
            return 0;
        }

        return countDigit(num/10) + 1;
    }

    public static void main(String[] args)
    {
        System.out.println(countDigit(1234));
    }
}
