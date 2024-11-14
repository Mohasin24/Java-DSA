package com.recursion.problem;

/*
Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array
Input = arr{1,2,3,2,2,5}, x=2
Output = 1,3,4
 */

import java.util.ArrayList;

public class _17_Occurance_target_array
{
//    public static ArrayList<Integer> retIndices(int[] arr, int target,ArrayList<Integer> al, int idx)
//    {
//        if(idx >= arr.length)
//        {
//            return al;
//        }
//
//        if(arr[idx] == target)
//        {
//            al.add(idx);
//        }
//
//        return retIndices(arr,target,al,idx+1);
//    }

    public static ArrayList<Integer> retIndices(int[] arr, int target, int idx)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx >= arr.length)
        {
            return ans;
        }

        if(arr[idx] == target)
        {
            ans.add(idx);
        }

        ArrayList<Integer> al = retIndices(arr,target,idx+1);
        ans.addAll(al);

        return ans;
    }

    public static void indicesArrPrint(int[] arr, int target, int idx)
    {
        if(idx >= arr.length)
        {
            System.out.println();
            return;
        }

        if(arr[idx] == target)
        {
            System.out.print(idx + " ");
        }

        indicesArrPrint(arr,target,idx+1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,2,2,5};

        indicesArrPrint(arr,2,0);

        System.out.println(retIndices(arr,2,0));
    }
}
