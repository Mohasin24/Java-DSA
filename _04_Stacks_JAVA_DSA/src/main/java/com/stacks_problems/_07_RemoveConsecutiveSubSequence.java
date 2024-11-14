package com.stacks_problems;

import java.util.Arrays;
import java.util.Stack;

public class _07_RemoveConsecutiveSubSequence
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2,2,2};

        _07_Solution sl = new _07_Solution();

        System.out.println(Arrays.toString(sl.remove(arr)));
    }
}

class _07_Solution
{
    public int[] remove(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        int len = arr.length;

        for(int i = 0; i<len; i++)
        {
            if(!st.isEmpty() && st.peek()==arr[i])
            {
                if(i==len-1 || (arr[i] != arr[i+1]))
                {
                    st.pop();
                }
            }
            else
            {
                st.push(arr[i]);
            }
        }

//        if(i<arr.length && st.peek()!=arr[i])
//        {
//            st.push(arr[i]);
//        }
//        else if (st.peek()==arr[i])
//        {
//            st.pop();
//        }

        int[] temp = new int[st.size()];

        for(int i = temp.length-1; i>=0; i--)
        {
            temp[i] = st.pop();
        }

        return temp;
    }
}
