package Linked_List_03.Circular_LinkedList;

public class Singly_Circular_LinkedList {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        display(a);
    }
}