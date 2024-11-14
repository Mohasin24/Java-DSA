package src.queues_problem;

/*
Problem Statement :
Reverse the first k element of a queue
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _04_Reverse_First_K_Elements_of_Queue
{
    public static void main(String[] args)
    {
        MyQueue obj = new MyQueue();

        Queue<Integer> qe = new LinkedList<>(List.of(1,2,3,4,5));

        obj.reverseK(qe,3);

        System.out.println(qe);

    }
}

class MyQueue
{
    public void reverseK(Queue<Integer> qe,int k)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<k; i++)
        {
            st.push(qe.remove());
        }

        while (!st.isEmpty())
        {
            qe.add(st.pop());
        }
    }
}
