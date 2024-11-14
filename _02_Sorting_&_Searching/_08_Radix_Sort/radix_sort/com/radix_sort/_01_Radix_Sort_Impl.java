package com.radix_sort;

import java.util.Arrays;

public class _01_Radix_Sort_Impl
{
    public static void radixSort(int[] arr)
    {
        int max = findMax(arr);

        for(int place = 1; max/place > 0; place*=10)
        {
            countSort(arr,place);
            System.out.println(place);
        }
    }

    private static void countSort(int[] arr, int place)
    {
        int len = arr.length;
        int[] out = new int[len];
        int[] count = new int[10];

        // fill the count array

        for(int i = 0; i<len; i++)
        {
            count[(arr[i]/place)%10]++;        // arr[i] = 455 , place = 1
                                               // (arr[i]/place)%10 = 5
        }

        // prefix sum of the count array
        for(int i = 1; i<10; i++)
        {
            count[i] += count[i-1];
        }

        // fill the output array according to the position of the element
        for(int i = len-1; i>=0; i--)
        {
            int pos = count[(arr[i]/place)%10] - 1;
            out[pos] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        // modify the original array

        for(int i = 0; i<len; i++)
        {
            arr[i] = out[i];
        }
    }

    private static int findMax(int[] arr)
    {
//        return Arrays.stream(arr).max().getAsInt();
        int max = 0;
        for(int x : arr) { max = Math.max(max, x);}
        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = {455,1,6,55,9,2,899,3,20,3,0,33};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
