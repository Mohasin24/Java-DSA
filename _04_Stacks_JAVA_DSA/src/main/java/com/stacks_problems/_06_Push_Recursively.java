package com.stacks_problems;

import java.util.Stack;

public class _06_Push_Recursively
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        _06_Solution sl = new _06_Solution();

        sl.pushAt(st,1, 101);

        System.out.println(st);
    }
}

class _06_Solution
{
    public void pushAt(Stack<Integer> st, int idx, int elem)
    {
        if(st.size() == idx)
        {
            st.push(elem);
            return;
        }

        int top = st.pop();
        pushAt(st,idx,elem);
        st.push(top);
    }
}
