package com.merge_sort;

import java.util.Arrays;

public class _01_Merge_Sort_Impl
{
    public static void main(String[] args)
    {
        int[] arr = {2,8,5,3,1,4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e) // 0 5
    {
        if(s>=e)
        {
            return;
        }

        int mid = s+(e-s)/2; //2

        mergeSort(arr, s,mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int start, int mid, int end)
    {
        int n1 = mid-start+1;
        int n2= end-mid;

        int[] first =new int[n1];
        int[] second =new int[n2];

        for(int i = 0; i<n1; i++)
        {
            first[i] = arr[start+i];
        }

        for(int i = 0; i<n2; i++)
        {
            second[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = start;

        while (i<n1 && j<n2 )
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

//  ************************ Kunal kushwah *************************************
//    public static void mergeSort(int[] arr, int s, int e)
//    {
//        if(e-s==1)
//        {
//            return;
//        }
//
//        int mid = s + (e-s)/2;
//
//        mergeSort(arr,s,mid);
//        mergeSort(arr,mid, e);
//
//        merge(arr,s,mid,e);
//    }
//
//    private static void merge(int[] arr, int s, int m, int e)
//    {
//        int[] temp = new int[e-s];
//
//        int i = s;
//        int j = m;
//        int k = 0;
//
//        while(i<m && j<e)
//        {
//            if(arr[i] < arr[j])
//            {
//                temp[k] = arr[i];
//                i++;
//            }
//            else
//            {
//                temp[k] = arr[j];
//                j++;
//            }
//
//            k++;
//        }
//
//        while (i<m)
//        {
//            temp[k] = arr[i];
//            i++;
//            k++;
//        }
//
//        while (j<e)
//        {
//            temp[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        i = 0;
//
//        while (i< temp.length)
//        {
//            arr[s+i] = temp[i];
//            i++;
//        }
//
//    }
