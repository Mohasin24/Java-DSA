package com.demo;

public class _01_Pattern
{
    public static void main(String[] args)
    {
        iterative(4);
//        printRec(4,0);
    }


    public static void iterative(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRec(int r, int c)
    {
        if(r<=0)
        {
            return;
        }

        if(c<r)
        {
            System.out.print("* ");
            printRec(r,c+1);
        }
        else
        {
            System.out.println();
            printRec(r-1,0);
        }
    }
}
