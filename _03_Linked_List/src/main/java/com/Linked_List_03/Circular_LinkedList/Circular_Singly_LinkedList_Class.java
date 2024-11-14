package Linked_List_03.Circular_LinkedList;

public class Circular_Singly_LinkedList_Class
{
    public static void main(String arg[])
    {
        CLL dd = new CLL();

        dd.add(1);
        dd.add(2);
        dd.add(3);
        dd.add(4);
        dd.add(5);

        dd.display();

        dd.deleteAt(3);

        dd.insertAt(4,101);

        dd.insertAtHead(151);

        dd.insertAt(3,100);

        dd.deleteAt(4);

        dd.display();

        System.out.println(dd.size());
    }
}

class CLL
{
    private int size = 0;
    private class Node
    {
        public int data;
        public Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    private Node head;
    private Node tail;
    public CLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void add(int data)
    {
        Node curr = new Node(data);

        if(head == null)
        {
            head = curr;
        }
        else
        {
            tail.next = curr;
        }
        tail = curr;
        tail.next = head;
    }

    public void display()
    {
        Node temp = this.head;

        do
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);

        System.out.println();
    }
    public int size()
    {
        return this.size;
    }

    public void deleteAt(int index)
    {
        if(index<0)
        {
            System.out.println("Invalid index!");
            return;
        }

        if(index == 0)
        {
            head = head.next;
            tail.next = head;
            this.size--;
            return;
        }

        Node temp = this.head;
        for(int i = 0; i<index-1; i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        this.size--;
    }

    public void insertAt(int index, int data)
    {
        if(index<0)
        {
            System.out.println("Invalid index!");
            return;
        }

        if(index >= size-1)
        {
            add(data);
            return;
        }
        else if (index == 0)
        {
            insertAtHead(data);
            return;
        }

        Node temp = this.head;

        for(int i = 0; i<index-1; i++)
        {
            temp = temp.next;
        }

        Node curr = new Node(data);

        curr.next = temp.next;
        temp.next = curr;

    }

    public void insertAtEnd(int data)
    {
        add(data);
    }

    public void insertAtHead(int data)
    {
        Node temp = new Node(data);

        tail.next = temp;
        temp.next = head;
        head = temp;
    }
}
