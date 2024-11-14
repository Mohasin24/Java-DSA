package com.demo;

import java.util.ArrayList;

public class _02_find_element_in_array
{
    public static void main(String[] args)
    {
//        System.out.println(getElemIdx(new int[] {1,2,3,4,5,2,9,4,11,10,5},0,4));
//        System.out.println(findAllOcc(new int[] {1,4,10,5,4},4,new ArrayList<Integer>(),
//                0));

        System.out.println(findAll(new int[] {1,4,10,5,4},4,0));
    }


    public static int getElemIdx(int[] arr, int idx, int target)
    {
        if(idx== arr.length)
        {
            return -1;
        }

        return arr[idx]==target?idx:getElemIdx(arr,idx+1,target);
    }

    public static ArrayList<Integer> findAllOcc(int[] arr, int target, ArrayList<Integer> ls, int idx)
    {
        if(idx== arr.length)
        {
            return ls;
        }

        if(arr[idx]==target)
        {
            ls.add(idx);
        }

        return findAllOcc(arr,target,ls,idx+1);
    }

    public static ArrayList<Integer> findAll(int[] arr, int target, int idx)
    {
        ArrayList<Integer> ls = new ArrayList<>();
        if(idx == arr.length)
        {
            return ls;
        }

        if (arr[idx]==target)
        {
            ls.add(idx);
        }

        ArrayList<Integer> ans = findAll(arr,target,idx+1);

        ls.addAll(ans);

        return ls;
    }
}
