package src.queues_problem;

/*
Problem Statement :
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false


Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, peek, and empty.
All the calls to pop and peek are valid.

*/

import java.util.Stack;

public class _05_Implement_Queue_Using_Stack {

    public static void main(String[] args)
    {
        MyQueuePush mp = new MyQueuePush();

        mp.push(1);
        mp.push(2);
        mp.push(3);
        mp.push(4);

        System.out.println(mp.peek());
        System.out.println(mp.pop());
        System.out.println(mp.peek());
    }
}

// push efficient
class MyQueuePush {

    private Stack<Integer> st;
    private Stack<Integer> temp;

    public MyQueuePush()
    {
        this.st = new Stack<>();
        this.temp = new Stack<>();
    }

    public void push(int x)
    {
        st.push(x);
    }

    public int pop()
    {
        int iRet = 0;
        while(st.size() > 1)
        {
            temp.push(st.pop());
        }

        iRet = st.pop();

        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }

        return iRet;
    }

    public int peek()
    {
        int iRet = 0;

        while(st.size() > 1)
        {
            temp.push(st.pop());
        }

        iRet = st.peek();

        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }

        return iRet;
    }

    public boolean empty()
    {
        return st.isEmpty();
    }
}

//pop efficient
class MyQueuePop {

    private Stack<Integer> st;
    private Stack<Integer> temp;

    public MyQueuePop()
    {
        this.st = new Stack<>();
        this.temp = new Stack<>();
    }

    public void push(int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
        }
        else
        {
            while(!st.isEmpty())
            {
                temp.push(st.pop());
            }

            st.push(x);

            while(!temp.isEmpty())
            {
                st.push(temp.pop());
            }
        }
    }

    public int pop()
    {
        return st.pop();
    }

    public int peek()
    {
        return st.peek();
    }

    public boolean empty()
    {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */