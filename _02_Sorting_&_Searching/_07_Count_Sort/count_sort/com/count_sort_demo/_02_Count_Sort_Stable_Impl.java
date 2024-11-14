package com.count_sort_demo;

// Stable means it did not changes the position of duplicate elements in the sorted array

import java.util.Arrays;

public class _02_Count_Sort_Stable_Impl
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,1,0,12,6,3,16,9};

        countSortStable(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void countSortStable(int[] arr)
    {
        //1. find max element
        int max = 0;
        for(int x : arr)
        {
            max = Math.max(x,max);
        }

        //2. create array of max element size
        int[] count = new int[max+1];

        //3. update the values in count array
        for (int x : arr)
        {
            count[x]++;
        }
        // 4. update the count array by taking the prefix sum
        for(int i = 1; i< count.length; i++)
        {
            count[i] += count[i-1];
        }

        //5. override the values in the original array

        int[] ans = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--)
        {
            int pos = count[arr[i]] - 1;
            count[arr[i]]--;
            ans[pos] = arr[i];
        }

        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = ans[i];
        }
    }
}
