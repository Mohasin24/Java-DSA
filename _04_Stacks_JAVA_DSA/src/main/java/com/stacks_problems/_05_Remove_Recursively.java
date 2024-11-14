package com.stacks_problems;

import java.util.Stack;
public class _05_Remove_Recursively
{


    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        _05_Solution sl = new _05_Solution();

        sl.removeAt(st,0);

        System.out.println(st);
    }
}

class _05_Solution
{
    public void removeAt(Stack<Integer> st, int idx)
    {
        if(idx > st.size())
        {
            System.out.println("Invalid index");
            return;
        }
        if(st.size()-1 == idx)
        {
            st.pop();
            return;
        }

        int top = st.pop();
        removeAt(st, idx);
        st.push(top);
    }
}
