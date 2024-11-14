package com.recursion.problem;
/*
Calculate nth fibonacci term
0 1 1 2 3 5 8 13 21
0 1 2 3 4 5 6 7  8
 */
public class _04_nth_fibonacci_term
{
    public static void main(String[] args)
    {
        System.out.println(fibSeries(8));
    }

    public static int fibSeries(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int num = fibSeries(n-1) + fibSeries(n-2);

        return num;
    }
}
