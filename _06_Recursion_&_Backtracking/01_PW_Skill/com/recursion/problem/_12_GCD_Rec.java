package com.recursion.problem;

import java.util.Scanner;

/*
Claculate the GCD using recursion and Euclids algorithm gcd(x,y) = gcd(y,x%y)
and gcd(x,0) = x
 */
public class _12_GCD_Rec
{
    public static int GCD(int x, int y)
    {
        if(y==0)
        {
            return x;
        }

        return GCD(y,x%y);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of X:- ");
        int x = sc.nextInt();
        System.out.print("Enter value of Y:- ");
        int y = sc.nextInt();

        System.out.println(GCD(x,y));


    }
}
