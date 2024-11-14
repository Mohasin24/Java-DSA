/*
Print n to 1 number using recursion
 */

package com.recursion.demo;

public class _01_Demo_Recursion
{
    public static void main(String[] args)
    {
        printRecu(10);
    }

    public static void printRecu(int n)
    {

        if(n == 1)
        {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printRecu(n-1);
    }
}
