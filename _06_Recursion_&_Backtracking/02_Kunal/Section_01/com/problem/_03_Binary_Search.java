package com.problem;

public class _03_Binary_Search
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,8,9,11,12,15,16};

        System.out.println(binarySearch(arr,0,arr.length, 16));
    }

    // returns target element index
    public static int binarySearch(int[] arr, int start, int end, int t)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid]==t)
        {
            return mid;
        }
        else if(arr[mid]<t)
        {
            return binarySearch(arr,mid+1, arr.length,t);
        }
        else
        {
           return binarySearch(arr,0, mid-1,t);
        }

    }
}
