package com.recursion.problem;

/*
Problem Statement :
Calculate the factorial of N;
 */

public class _03_Factorial_of_N
{
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }

    public static int fact(int n)
    {
        if (n==0)
        {
            return 1;
        }

//        int num = n * fact(n-1);
        return n * fact(n-1);

//        return num;
    }
}
