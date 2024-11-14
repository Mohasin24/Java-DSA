package com.problem;
// 0 1 2 3 4 5 6 7
// 0 1 1 2 3 5 8 13

public class _01_Fib
{
    public static void main(String[] args)
    {
        System.out.println(fib(4));
    }

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
