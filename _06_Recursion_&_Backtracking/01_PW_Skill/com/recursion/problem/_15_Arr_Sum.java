package com.recursion.problem;

/*
FInd the sum of total elements of an Array
 */
public class _15_Arr_Sum
{
    public static int arrSum(int[] arr, int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }

        int sum = arr[idx] + arrSum(arr, idx+1);

        return sum;

    }
    public static void main(String[] args)
    {
        int[] arr = {1,5,2,3,4,5,6};

        System.out.println(arrSum(arr,0));
    }
}
