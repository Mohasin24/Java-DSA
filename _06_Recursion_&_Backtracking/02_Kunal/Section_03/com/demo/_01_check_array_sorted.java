package com.demo;

public class _01_check_array_sorted
{
    public static void main(String[] args)
    {
        System.out.println(checkArraySorted(new int[] {1,2,3,4,5},0));
    }

    public static boolean checkArraySorted(int[] arr, int idx)
    {
        if(idx== arr.length-1)
        {
            return true;
        }

//        if(arr[idx]<arr[idx+1])
//        {
//            return checkArraySorted(arr,idx+1);
//        }
//
//        return false;

        return  (arr[idx]<arr[idx+1]) && checkArraySorted(arr,idx+1);
    }

}
