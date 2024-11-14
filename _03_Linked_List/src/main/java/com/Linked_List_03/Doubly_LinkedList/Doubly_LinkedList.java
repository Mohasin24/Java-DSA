package Linked_List_03.Doubly_LinkedList;

class DLinkedList
{
    private class Node
    {
        public int val;
        public Node next;
        public Node prev;

        public Node(int val)
        {
            this.val = val;
            length++;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int length = 0;
    public void add(int val)
    {
        Node temp = new Node(val);

        if(head == null)
        {
            head = temp;
        }
        else
        {
            tail.next = temp;
            tail.next.prev = tail;
        }

        tail = temp;

    }

    // display linkedList
    public void display()
    {
        Node temp = this.head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse()
    {
        Node temp = tail;

        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public int size()
    {
        return this.length;
    }

    @Override
    public String toString()
    {
        Node temp = head;

        StringBuilder sb = new StringBuilder();

        while (temp != null)
        {
            sb.append(temp.val + " ");
            temp = temp.next;
        }

        return sb.toString();
    }

    public int getAt(int index)
    {
        if(index > length-1)
        {
            return -1;
        }

        Node temp = head;

        for(int i = 0; i<index; i++)
        {
            temp = temp.next;
        }

        return temp.val;
    }

    public DLinkedList reverseList()
    {
        Node temp = tail;
        DLinkedList list = new DLinkedList();

        for(int i = 0; i<this.length; i++)
        {
            list.add(temp.val);
            temp = temp.prev;
        }

        return list;
    }

    public void reverseSame()
    {
        Node tempHead = head;
        Node tempTail = tail;

        while (tempHead != tempTail)
        {
            int temp = tempHead.val;
            tempHead.val = tempTail.val;
            tempTail.val = temp;

            tempHead = tempHead.next;
            tempTail = tempTail.prev;
        }
    }

    public int getHead()
    {
        return head.val;
    }

    public int getTail()
    {
        return tail.val;
    }

    public int getValueAt(int index)
    {
        if(index > this.length-1 || index<0)
        {
            System.out.println("Invalid index !");
            return -1;
        }
        Node temp = head;

        while (temp != null && index-1 >=0)
        {
            temp = temp.next;
            index--;
        }

        return temp.val;
    }

    public void insertAt(int index, int val)
    {
        if(index > this.length-1)
        {
            add(val);
            return;
        }
        else if (index == 0)
        {
            insertAtHead(val);
            return;
        }
        else if(index < 0)
        {
            System.out.println("Invalid index !");
            return;
        }


        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 0; i<index-1; i++)
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        newNode.next.prev = newNode;
        temp.next = newNode;

    }

    public void insertAtHead(int val)
    {
        Node newHead = new Node(val);

        head.prev = newHead;
        newHead.next = head;
        head = newHead;
    }

    public void setValueAt(int index, int val)
    {
        Node temp = head;

        if(index > this.length-1 || index<0)
        {
            System.out.println("invalid index");
            return;
        }
        while (index-1>=0)
        {
            temp = temp.next;
            index--;
        }

        temp.val = val;
    }

    public void delete(int index)
    {
        if(index > this.length-1 || index<0)
        {
            System.out.println("Invalid index !");
            return;
        }

        if(index == 0)
        {
            head = head.next;
            head.prev = null;
            return;
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
            return;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;

    }
}

public class Doubly_LinkedList
{
    public static void main(String[] args)
    {
        DLinkedList dl = new DLinkedList();

        dl.add(11); //0
        dl.add(21); //1
        dl.add(51); //2
        dl.add(101); //3
        dl.add(151); //4

//        dl.display();
//        dl.displayReverse();
//        System.out.println(dl.size());
//        System.out.println(dl);
//        System.out.println(dl.getAt(0));
//
//        System.out.println(dl.reverseList());
        dl.reverseSame();
        System.out.println(dl);
        System.out.println(dl.getAt(0));
        dl.reverseSame();
//        dl.insertAt(5,99);
//        dl.insertAtHead(255);
//        dl.setValueAt(3,15);

        System.out.println(dl);
//        dl.delete(2);
        System.out.println(dl);
//        System.out.println(dl.getValueAt(51));
    }
}
