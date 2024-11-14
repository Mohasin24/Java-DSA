package com.stack_demo;

public class _02_Stack_Array_Implementation
{
    private static class Stack
    {
        private int initialSize = 0;
        private int[] stackArr;

        private int idx = 0;
        public Stack(int size)
        {
            this.initialSize = size;
            this.stackArr = new int[initialSize];
        }

        public void push(int elem)
        {
            if(idx == initialSize)
            {
                System.out.println("Stack is full!");
                return;
            }

            stackArr[idx] = elem;
            idx++;
        }

        public int peek()
        {
            if(idx == 0)
            {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return stackArr[idx-1];
        }

        public void show()
        {
            for (int i = 0; i<idx; i++)
            {
                System.out.print(stackArr[i] + " ");
            }

            System.out.println();
        }

        public int pop()
        {
            if(idx == 0)
            {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int iRet = stackArr[idx-1];
            stackArr[idx-1] = 0;
            idx--;

            return iRet;
        }

        public boolean isEmpty()
        {
            if(idx == 0)
            {
                return true;
            }

            return false;
        }

        public boolean isFull()
        {
            if(idx == initialSize)
            {
                return true;
            }

            return false;
        }

        public int size()
        {
            return idx;
        }

        public int getInitialSize()
        {
            return initialSize;
        }
    }

    public static void main(String[] args)
    {
        Stack st = new Stack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.peek());

//        st.show();

//        st.pop();
//        st.pop();

        st.show();
        st.push(101);

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

        st.push(55);
        st.show();
        System.out.println(st.size());
//
//        System.out.println(st.getInitialSize());
    }
}


