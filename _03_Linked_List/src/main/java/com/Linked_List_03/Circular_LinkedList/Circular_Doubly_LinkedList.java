package com.Linked_List_03.Circular_LinkedList;

public class Circular_Doubly_LinkedList
{
    public static class Node
    {
        int val;

        Node next;
        Node prev;

        public Node(int val)
        {
            this.val = val;
        }
    }

    public static void display(Node head)
    {
        Node temp = head.next;

        System.out.print(head.val + " ");
        while (temp != head)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.prev = e;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = a;

        display(a);
    }
}
