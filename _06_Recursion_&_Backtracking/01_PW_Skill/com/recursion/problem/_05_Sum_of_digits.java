package com.recursion.problem;

/*
Problem Statement :
Given an integer find out the sum of its digits using recursion
 */
public class _05_Sum_of_digits
{
    public static int sumDigit(int num)
    {
        if(num >= 0 && num<= 9)
        {
            return num;
        }

//        int sum = 0;
//
//        sum =(num%10) + sumDigit(num/10);


        return (num%10) + sumDigit(num/10);
    }
    public static void main(String[] args)
    {

        System.out.println(sumDigit(5));
    }
 }
