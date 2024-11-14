package com.recursion.problem;

/*
Find the last index of target;
 */
public class _19_Last_Index
{
    public static int lastIndex(int[] arr, int target, int idx)
    {
        if(idx<0)
        {
            return -1;
        }

        if(arr[idx] == target)
        {
            return idx;
        }
        else
        {
            return lastIndex(arr,target,idx-1);
        }

    }

    public static void main(String[] arg)
    {
        int[] arr = {1,2,5,6,2,8,9,2,0,3};
        System.out.println(lastIndex(arr,1,arr.length-1));
    }
}
