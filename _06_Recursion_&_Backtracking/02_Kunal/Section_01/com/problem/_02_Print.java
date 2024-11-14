package com.problem;

public class _02_Print
{
    public static void main(String[] args)
    {
        print(5);
    }

    public static void print(int n)
    {
        if(n==0)
        {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
