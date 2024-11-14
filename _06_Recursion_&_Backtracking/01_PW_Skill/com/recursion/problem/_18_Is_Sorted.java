package com.recursion.problem;

public class _18_Is_Sorted
{
    public static boolean isSorted(int[] arr, int idx)
    {
        if(idx >= arr.length-1)
        {
            return true;
        }

        if(arr[idx] > arr[idx+1])
        {
            return false;
        }
        else
        {
            return isSorted(arr,idx+1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(isSorted(new int[]{1,2,3,4,5,6,0}, 0));
    }
}
