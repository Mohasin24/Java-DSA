package com.recursion.problem;

/*
Find the max element in an array using recursion
 */

public class _14_Max_Element_Arr
{
    public static int maxElm(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return 0;
        }

        int max = Math.max(arr[idx], maxElm(arr,idx+1));
        return max;

    }

    public static void main(String[] args)
    {
        int[] arr = {3,4,5,10,15,20};

        System.out.println(maxElm(arr,0));
    }
}
