package com.demo;

import java.util.Arrays;

public class _04_Selection_sort
{
    public static void main(String[] args)
    {
        int[] arr = {2,80,4,11,10,7,8,9,3,1};
        selectionSort2(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int i, int j, int max)
    {
        if(i<0)
        {
            return;
        }

        if(j<=i)
        {
            if(arr[j]>arr[max])
            {
                max = j;
            }
            selectionSort(arr,i,++j,max);
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            selectionSort(arr,--i,0,0);
        }
    }

    public static void selectionSort2(int[] arr, int i, int j, int max)
    {
        if(i==0)
        {
            return;
        }

        if(j<i)
        {
            if(arr[j]>arr[max])
            {
                selectionSort2(arr,i,j+1,j);
            }
            else {
                selectionSort2(arr,i,j+1,max);
            }

        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            selectionSort2(arr,i-1,0,0);
        }
    }
}
