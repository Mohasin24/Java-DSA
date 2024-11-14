/*
Problem Statement :
Print all the element of a queue without using inbuilt method
 */

package src.queues_problem;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class _01_print_all_queue_element
{
    public static void main(String[] args)
    {
        _01_Solution sl = new _01_Solution();
        ArrayDeque<Integer> qe = new ArrayDeque<>();

        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        qe.add(101);

//        sl.printAllQueue(qe);
        sl.printAllArray(qe);
//        sl.mostEf(qe);

        System.out.println(qe);

    }
}

class _01_Solution
{
    public void printAllQueue(ArrayDeque<Integer> qe)
    {
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        while(!qe.isEmpty())
        {
            System.out.print(qe.element() + " ");
            temp.add(qe.remove());
        }
        System.out.println();

        while(!temp.isEmpty())
        {
            qe.add(temp.remove());
        }
    }

    public void printAllArray(Queue<Integer> qe)
    {
        int[] temp = new int[qe.size()];

        int i = 0;

        while(!qe.isEmpty())
        {
            System.out.print(qe.element() + " ");
            temp[i++] = qe.remove();
        }
        System.out.println();

        for (i = 0; i<temp.length; i++)
        {
            qe.add(temp[i]);
        }
    }

    public void mostEf(Queue<Integer> qe)
    {
        int len = qe.size();

        for (int i = 0; i<len; i++)
        {
            System.out.print(qe.element() + " ");
            qe.add(qe.remove());
        }
        System.out.println();
    }
}
