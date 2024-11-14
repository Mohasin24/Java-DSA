package com.demo;

public class _02_factorial
{
    public static void main(String[] args)
    {
        System.out.println(facto(4));
    }

    public static int facto(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int result = n * facto(n-1);

        return result;
    }
}
