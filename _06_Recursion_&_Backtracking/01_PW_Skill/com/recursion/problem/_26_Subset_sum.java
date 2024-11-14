package com.recursion.problem;

/*
Problem Statement :
Given an array of integers, print sums of all subsets in it. Output sum an be printed in any order

Input : arr[] = {2,3}
Output : 0 2 3 5

Input : arr[] = {2,4,5}
Output : 0 2 4 5 6 7 9 11
 */

public class _26_Subset_sum
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,5};
        subSetSum(arr, arr.length, 0,0);
    }

    private static void subSetSum(int[] arr, int len, int idx, int sum)
    {
        if(idx >= len)
        {
            System.out.print(sum + ", ");
            return;
        }

        int curr = arr[idx];

        subSetSum(arr,len,idx+1, sum+curr);
        subSetSum(arr,len,idx+1, sum);
    }
}
