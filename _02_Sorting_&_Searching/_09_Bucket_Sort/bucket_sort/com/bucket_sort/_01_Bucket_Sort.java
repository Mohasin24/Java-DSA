package com.bucket_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_Bucket_Sort
{

    public static void bucketSort(float[] arr)
    {
        int n = arr.length;

        // create the bucket arrray of length of n
        ArrayList<Float>[] bucket = new ArrayList[n];

        // initialise each arraylist of bucket array
        for(int i = 0; i<bucket.length; i++)
        {
            bucket[i] = new ArrayList<>();
        }

        // add each element of the arr into the specified bucket
        for(int i = 0; i<n; i++)
        {
            int idx = (int)(arr[i] * n);
            bucket[idx].add(arr[i]);
        }

        // sort the individual buckets

        for(int i = 0; i<bucket.length; i++)
        {
            Collections.sort(bucket[i]);
        }

        // override the arr elements

        int idx = 0;

        for(int i = 0; i<bucket.length; i++)
        {
            for (float x : bucket[i])
            {
                arr[idx++] = x;
            }
        }
    }

    public static void main(String[] args)
    {
        float[] arr = {0.3f, 0.1f, 0.9f, 0.7f, 0.5f, 0.2f, 0.4f, 0.6f, 0.8f};

        bucketSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
