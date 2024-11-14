package com.recursion.problem;

public class _08_First_K_multiples
{
    public static void printKMul(int num, int k)
    {
        // base case
        if(k==1)
        {
            System.out.print(num + " ");
            return;
        }

        // recursive work
        printKMul(num,k-1);

        // self work
        System.out.print(num*k + " ");
    }

    public static void main(String[] args) {
        printKMul(3,8);
    }
}
