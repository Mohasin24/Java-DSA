package com.quick_sort;

import java.util.Arrays;

public class _01_Quick_Sort_Impl
{
    public static void quick_sort(int[] arr, int low, int hi)
    {
        if(low>=hi)
        {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s<=e)
        {
            while (arr[s]<pivot)
            {
                s++;
            }

            while (arr[e]>pivot)
            {
                e--;
            }

            if(s<=e)
            {
                swap(arr,s,e);
                s++;
                e--;
            }

        }

        quick_sort(arr,low,e);
        quick_sort(arr,s,hi);
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,4,6,2,1,8,8,8,4,3,15,13,14,9};

        System.out.println("Before sorting : \n" + Arrays.toString(arr));

        quick_sort(arr,0, arr.length-1);

        System.out.println("After sorting : \n" + Arrays.toString(arr));

    }
}
