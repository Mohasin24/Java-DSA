package Linked_List_03.Doubly_LinkedList;

public class Basic_DLL_01
{
    public static class Node
    {
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void display(Node head)
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // display all the elements from starting of a linked list. You are given a random node. It may be first, last or middle or any node

    public static void displayRandom(Node random)
    {
        Node temp = random;

        while (temp != null)
        {
            if(temp.prev == null)
            {
                break;
            }

            temp = temp.prev;
        }

        display(temp);
    }

    // You are given a random node. Print all the elements of linked list in reverse order
    public static void displayRandomReverse(Node random)
    {
        Node temp = random;

        while (temp != null)
        {
            if(temp.next==null)
            {
                break;
            }

            temp = temp.next;
        }

        displayReverse(temp);
    }

    public static void displayReverse(Node tail)
    {
        Node temp = tail;

        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static Node insertAtHead(Node head, int val)
    {
        Node temp = head;
        if(head.prev != null)
        {
            while (temp != null)
            {
                if(temp.prev == null)
                {
                    head = temp;
                    break;
                }
                temp = temp.prev;
            }
        }

        Node newHead = new Node(val);

        newHead.next = head;
        head.prev = newHead;
//        head = newHead;

        return newHead;
    }

    // here you can also provide head or any node till it will insert the value at the tail
    public static Node insertAtTail(Node tail, int val)
    {
        Node temp = tail;
        if(tail.next != null)
        {
            while (temp != null)
            {
                if(temp.next == null)
                {
                    tail = temp;
                    break;
                }
                temp = temp.next;
            }
        }

        Node newTail = new Node(val);

        temp.next = newTail;
        newTail.prev = temp;
        tail = newTail;

        return tail;
    }

    public static void insertAt(int index, Node head, int val)
    {
        Node temp = head;
        for(int i = 0; i<index-1; i++)
        {
            temp = temp.next;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        newNode.prev = temp;
        newNode.next.prev = newNode;
        temp.next = newNode;
    }

    public static Node deleteAt(int index, Node head)
    {
        if(index == 0)
        {
            head = head.next;
            head.prev = null;
            return head;
        }

        Node temp = head;

        for(int i = 0; i<index-1; i++)
        {
            temp = temp.next;
        }

//        System.out.println(temp.val);

        if(temp.next.next==null)
        {
            temp.next.prev = null;
            temp.next = null;
            return head;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;

        return head;
    }
    public static void main(String[] args)
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

//       Node newHead = insertAtHead(c,99);
//       Node newTail = insertAtTail(e,111);
//        display(newHead);
//        displayReverse(newTail);
//        displayRandom(c);
//        displayRandomReverse(e);

//        System.out.println(a.val);
//        insertAt(3,a,25);
        a = deleteAt(4,a);
        display(a);

    }
}
