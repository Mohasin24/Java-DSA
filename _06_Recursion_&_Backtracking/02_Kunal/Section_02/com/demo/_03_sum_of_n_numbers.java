package com.demo;

public class _03_sum_of_n_numbers
{
    public static void main(String[] args)
    {
        System.out.println(sum(5));
    }

    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int result = n + sum(n-1);

        return result;
    }
}
