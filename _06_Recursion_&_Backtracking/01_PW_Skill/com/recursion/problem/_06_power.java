package com.recursion.problem;

/*
Problem Statement :
Given two numbers p & q, find the value p to power q using a recursive function
 */
public class _06_power
{
    public static int power(int num, int pow)
    {
        if(pow == 0)
        {
            return 1;
        }
        return num*power(num,pow-1);
    }

    public static int power2(int num, int pow)
    {
        if(pow == 0)
        {
            return 1;
        }

        int mul = power2(num, pow/2);

       if(pow%2 == 0)
       {
           return mul*mul;
       }
       else if(pow%2 != 0)
       {
           return  mul*mul*num;
       }

       return 1;
    }

    public static void main(String[] args)
    {
        System.out.println(power2(2,5  ));
    }
}
