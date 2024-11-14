package com.count_sort_demo;

// Count sort is mostly usefull in a range

import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_Count_Sort_Impl
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,7,3,0,0,8,4,1,20,89,11};

        countSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr)
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

        //4. override the values in the original array

        // method 1
//        int k = 0;
//        for(int i = 0; i<count.length; i++)
//        {
//            for(int j = count[i]; j>0; j--)
//            {
//                arr[k++] = i;
//            }
//        }

        //Method 2
        int i = 0;
        int j = 0;

        while(j< count.length)
        {
            if(count[j] > 0)
            {
                while (count[j]>0)
                {
                    arr[i++] = j;
                    count[j]--;
                }
            }

            j++;

        }


    }
}
