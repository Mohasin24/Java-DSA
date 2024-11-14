package com.demo;

import java.util.Arrays;

public class _03_Bubble_Sort
{
    public static void main(String[] args) {
        int[] arr = {2,80,4,11,10,7,8,9,3,1}; //1,2,3,8,9

        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int i, int j)
    {
        if(i<0)
        {
            return;
        }

        if(j<=i)
        {
            if(arr[i]<arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            bubbleSort(arr,i,++j);
        }
        else
        {
            bubbleSort(arr,--i,0);
        }

    }
}
