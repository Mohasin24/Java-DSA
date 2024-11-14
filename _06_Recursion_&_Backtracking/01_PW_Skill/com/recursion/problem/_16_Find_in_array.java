package com.recursion.problem;

/*
Find if the target element is present in an array or not

 */
public class _16_Find_in_array
{
    public static boolean findArr(int[] arr, int target, int idx)
    {
        if(idx >= arr.length)
        {
            return false;
        }

        if (arr[idx] == target)
        {
            return true;
        }
        else
        {
            return findArr(arr,target,idx+1);
        }
    }

    //returns the indxe of target element in an array if present
    public static int findArrIdx(int[] arr, int target, int idx)
    {
        if(idx >= arr.length)
        {
            return -1;
        }

        if (arr[idx] == target)
        {
            return idx;
        }
        else
        {
            return findArrIdx(arr,target,idx+1);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,5,2,3,4,5,6};

        System.out.println(findArr(arr,6,0));
        System.out.println(findArrIdx(arr,3,0));
    }
}
