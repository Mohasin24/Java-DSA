package com.recursion.problem;

public class _01_Print_N_numbers
{
    public static void main(String[] args)
    {
        printRecu(2000);
    }

    public static void printRecu(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return;
        }

        printRecu(n-1);
        System.out.print(n + " ");
    }
}

