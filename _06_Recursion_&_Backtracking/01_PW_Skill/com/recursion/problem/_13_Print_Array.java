package com.recursion.problem;

public class _13_Print_Array
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        print(arr,9);
    }

    public static void print(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
            System.out.print(arr[idx] + " ");
            return;
        }
        else if(idx >= arr.length)
        {
            System.out.println("Invalid index!");
            return;
        }

        System.out.print(arr[idx] + " ");

        print(arr, idx+1);
    }
}
