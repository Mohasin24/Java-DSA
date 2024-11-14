package com.recursion.problem;

public class _02_Print_N_numbers_reverse
{
    public static void main(String[] args)
    {
        printReverseRecu(20);
    }

    public static void printReverseRecu(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");

        printReverseRecu(n-1);
    }
}


