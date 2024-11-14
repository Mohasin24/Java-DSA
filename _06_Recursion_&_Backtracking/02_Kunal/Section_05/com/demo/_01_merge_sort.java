package com.demo;

import java.util.Arrays;

public class _01_merge_sort
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,5,2,1};

        int[] res = MergeSort.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}

class MergeSort
{
    public static int[] sort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArray(left,right);
    }

    private static int[] mergeArray(int[] first, int[] second)
    {
        int[] mix = new int[first.length+ second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j< second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while (i< first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }

        while (j< second.length)
        {
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
