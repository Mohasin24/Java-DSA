package src.queues_problem;

/*
Problem Statement :
1 2 3 4 5 6 7 8
1 5 2 6 3 7 4 8

Queue length is always even
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _06_Reorder_Queue
{
    public static void main(String[] args)
    {
        Queue<Integer> qe = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));

        _06_Solution sl = new _06_Solution();

        sl.reorderQueue(qe);  // expected => 1 5 2 6 3 7 4 8

        System.out.println(qe);

    }
}

class _06_Solution
{
    private Stack<Integer> st;

    public _06_Solution()
    {
        st = new Stack<>();
    }
    public void reorderQueue(Queue<Integer> qe)
    {
        // 1 2 3 4 5 6 7 8

        // empty half of the queue and add to stack
        emptyHalf(qe); //5 6 7 8
        
        // add back all the elements of a queue from stack to queue
        while (!st.isEmpty())
        {
            qe.add(st.pop());
        }

//        5 6 7 8 4 3 2 1

        //again empty half queue to stack
        emptyHalf(qe);  // 4 3 2 1

        // put one element from stack and remove and add one from queue to queue
        while (!st.isEmpty())
        {
            qe.add(st.pop());
            qe.add(qe.remove());
        }

        // reverse the queue
        reverseQueue(qe);

    }

    private void emptyHalf(Queue<Integer> qe)
    {
        st.clear();
        int len = qe.size();

        for(int i = 0; i<len/2; i++)
        {
            st.push(qe.remove());
        }
    }

    private void reverseQueue(Queue<Integer> qe)
    {
        st.clear();

        while (!qe.isEmpty())
        {
            st.push(qe.remove());
        }

        while (!st.isEmpty())
        {
            qe.add(st.pop());
        }
    }
}
