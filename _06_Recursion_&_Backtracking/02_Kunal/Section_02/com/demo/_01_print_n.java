package com.demo;

/*
Print 1 to N numbers
 */

public class _01_print_n
{
    public static void main(String[] args)
    {
        print(5);
    }

    public static void printRev(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printRev(n-1);
    }

    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }

        print(n-1);
        System.out.println(n);
    }
}
