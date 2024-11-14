package com.demo;

import java.util.Arrays;

public class _02_Merge_Sort_Inplace
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,5,2,1};
        MergeSortInplace2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

class MergeSortInplace
{
    public static void sort(int[] arr)
    {
        mergeSort(arr, 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = s + (e-s)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1, e);

        mergeArray(arr,s,mid,e);
    }

    private static void mergeArray(int[] arr, int s, int mid, int e)
    {
        int n1 = mid-s+1;
        int n2 = e-mid;

        int[] first = new int[n1];
        int[] second = new int[n2];

        for(int i = 0; i<n1; i++)
        {
            first[i] = arr[s+i];
        }

        for(int i = 0; i<n2; i++)
        {
            second[i] = arr[mid+i+1];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while (i<n1 && j<n2)
        {
            if(first[i]<second[j])
            {
                arr[k] = first[i];
                i++;
            }
            else
            {
                arr[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<n1)
        {
            arr[k] = first[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            arr[k] = second[j];
            j++;
            k++;
        }
    }
}

//end exlusive e=arr.length
class MergeSortInplace2
{
    public static void sort(int[] arr)
    {
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(int[] arr, int start, int end)
    {
        if(end-start==1)
        {
            return;
        }

        int mid  = start + (end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeArray(arr,start,mid,end);
    }

    private static void mergeArray(int[] arr, int start, int mid, int end)
    {
        int n1 = mid-start;
        int n2 = end-mid;

        int[] firstHalf = new int[n1];
        int[] secondHalf = new int[n2];

        for(int i = 0; i<n1; i++)
        {
            firstHalf[i] = arr[start+i];
        }

        for(int i = 0; i<n2; i++)
        {
            secondHalf[i] = arr[mid+i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i<n1 && j<n2)
        {
            if(firstHalf[i]<secondHalf[j])
            {
                arr[k++]=firstHalf[i++];
            }
            else
            {
                arr[k++]=secondHalf[j++];
            }
        }

        while (i<n1)
        {
            arr[k++]=firstHalf[i++];
        }

        while (j<n2)
        {
            arr[k++]=secondHalf[j++];
        }
    }
}
