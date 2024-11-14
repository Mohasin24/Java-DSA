package com.recursion.problem;

public class _010_Sum_Of_N_number_alternative_signs
{
    public static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }

        if(n%2==0)
        {
            return sum(n-1)-n;
        }
        else
        {
            return n + sum(n-1);
        }


    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
