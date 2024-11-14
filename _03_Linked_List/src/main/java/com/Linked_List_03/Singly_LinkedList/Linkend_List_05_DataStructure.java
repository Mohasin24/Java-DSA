package Linked_List_03.Singly_LinkedList;

public class Linkend_List_05_DataStructure
{
    static class linkedList
    {
        private class Node
        {
            public int data;
            public Node nextNode;


            public Node(int data)
            {
                this.data = data;
                this.nextNode = null;
                len++;
            }
        }
        private Node head = null;
        private Node tail = null;
        private int len = 0;

        // setters
        public void insertAtEnd(int val)
        {
            Node temp = new Node(val);

            if(head == null)
            {
                head = temp;
            }
            else
            {
                tail.nextNode = temp;
            }

            tail = temp;
        }

        public void insertAtHead(int val)
        {
            Node temp = new Node(val);

            if(head==null)
            {
                head = tail = temp;
            }
            else
            {
                temp.nextNode = head;
                head = temp;
            }

        }

        public void insertAt(int index, int val)
        {
            Node temp = new Node(val);
            Node curr = head;

            if(index == len)
            {
                insertAtEnd(val);
            }
            else if(index == 0)
            {
                insertAtHead(val);
            }
            // not working properly
            else if(index<0 || index>size())
            {
                System.out.println("Invalid index");
                return;
            }

            for(int i = 0; i<index-1; i++)
            {
                curr = curr.nextNode;
            }

            temp.nextNode = curr.nextNode;
            curr.nextNode = temp;
        }

        // getters
        public int getFirstElement()
        {
            return head.data;
        }

        public int getLastElement()
        {
            return tail.data;
        }

        public int getAt(int index)
        {
            if(index < 0 || index > size())
            {
                return -1;
            }

            Node temp = head;

            for(int i = 0; i<index; i++)
            {
                temp = temp.nextNode;
            }

            return temp.data;
        }

        //delete  // rework
        public void deleteAt(int index)
        {

            if(index == 0)
            {
                head = head.nextNode;
                len--;
                return;
            }
            else if(index < 0 || index > size())
            {
                System.out.println("Invalid index");
                return;
            }

            Node temp = head;

            for(int i = 0; i<index-1; i++)
            {
                temp = temp.nextNode;
            }

            if(index == size()-1)
            {
                tail = temp;
            }
            len--;
            temp.nextNode = temp.nextNode.nextNode;
            temp.nextNode.nextNode = null;

        }
        public int size()
        {
            return len;
        }

        @Override
        public String toString()
        {
            Node temp = head;
            StringBuilder sb = new StringBuilder();

            while (temp != null)
            {
                sb.append(temp.data + " ");
                temp = temp.nextNode;
            }

            return sb.toString();
        }
    }

    public static void main(String[] args)
    {
        linkedList list = new linkedList();

        list.insertAtEnd(11);  // 0
        list.insertAtEnd(21);  // 1
        list.insertAtEnd(51);  // 2
        list.insertAtEnd(101); // 3

//        list.insertAtHead(5);
//        list.insertAtHead(201);

//        System.out.println(list.size());
//        list.insertAt(-1,201);
//        list.deleteAt(4);
        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.tail.data);
//        System.out.println(list.head.data);
//        System.out.println(list.size());
//        System.out.println(list.getFirstElement());
//        System.out.println(list.getLastElement());

    }
}

