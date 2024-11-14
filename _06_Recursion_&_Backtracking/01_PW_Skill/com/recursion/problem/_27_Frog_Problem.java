package com.recursion.problem;

/*
Problem Statement :
There are N stones, numbered 0,1,2,...,N-1. For each i (0<i<N), the height of Stone i is hi. There is a frog who is initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:

If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.

Here, a cost of hi- hj| is incurred, where j is the stone to land on.

Find the minimum possible total cost incurred before the frog reaches Stone N.

Input n=4
arr[]=10 30 40 20
Output=30
 */
public class _27_Frog_Problem
{
    private static int best(int[] h, int len, int idx)
    {
        if(idx == len-1)
        {
            return 0;
        }

        int op1 = Math.abs(h[idx]-h[idx+1]) + best(h,len,idx+1);

        if (idx == len-2)
        {
            return op1;
        }
        int op2 = Math.abs(h[idx]-h[idx+2]) + best(h,len,idx+2);

        return Math.min(op1,op2);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {10,30,40,20};
        System.out.println(best(arr, arr.length, 0));

    }
}
