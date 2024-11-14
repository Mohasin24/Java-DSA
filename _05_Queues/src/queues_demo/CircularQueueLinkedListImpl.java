package src.queues_demo;

public class CircularQueueLinkedListImpl
{
    public static void main(String[] args)
    {
        CircularQueueLinkedList qe = new CircularQueueLinkedList();

        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);

        System.out.println(qe);

        qe.remove();
        qe.remove();
        qe.remove();
//
        System.out.println(qe.element());

        System.out.println("Size = " + qe.size());

        System.out.println(qe.isEmpty());

        System.out.println(qe);  // display
        qe.remove();

        System.out.println(qe);
        System.out.println("Size = " + qe.size());
    }
}

class CircularQueueLinkedList
{
    private int cnt = 0;
    private class Node
    {
        public Node next;
        public int val;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
            cnt++;
        }
    }

    private Node head;
    private Node tail;

    public CircularQueueLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void add(int val)
    {
        Node temp = new Node(val);

        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
            tail = temp;
        }

        tail.next = head;
    }

    public int remove()
    {
        if(head == null)
        {
            return -1;
        }
        cnt--;
        int val = head.val;
        head = head.next;
        tail.next = head;
        return val;
    }

    public int element()
    {
        if(head == null)
        {
            return -1;
        }
        return head.val;
    }

    public int size()
    {
        return cnt;
    }

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        if(head == null)
        {
            return "[]";
        }

        Node temp = head;

        StringBuilder sb = new StringBuilder("[");

        while (temp.next.val != head.val)
        {
            sb.append(temp.val +", ");
            temp = temp.next;
        }
        sb.append(temp.val + "]");

        return sb.toString();
    }
}