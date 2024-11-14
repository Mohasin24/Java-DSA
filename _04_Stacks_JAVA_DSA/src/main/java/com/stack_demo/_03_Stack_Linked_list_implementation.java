package com.stack_demo;

public class _03_Stack_Linked_list_implementation
{
    public static void main(String[] args)
    {
        LLStack st = new LLStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

//        st.show();

        st.pop();
        System.out.println(st.pop());

        System.out.println(st.peek());

        st.push(5);

        System.out.println(st.size());

//        st.show();

        System.out.println(st.isEmpty());

        st.showReverse();
        st.show();


    }
}

class LLStack
{
    private Node head = null;
    private int len = 0;
    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;

        len++;
    }

    public int peek()
    {
        return head.data;
    }

    public int pop()
    {
        int val = head.data;
        head = head.next;
        len--;

        return val;
    }

    public int size()
    {
        return len;
    }

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }

        return false;
    }

    private void showRec(Node h)
    {
        if(h == null)
        {
            return;
        }
        showRec(h.next);
        System.out.print(h.data + " ");
    }
    public void show()
    {
        showRec(head);
        System.out.println();
    }
    public void showReverse()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
class Node
{
    public Node next;
    public int data;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
