package Linked_List_03.Singly_LinkedList;

public class Linked_List_01
{
    public static void main(String[] arg)
    {
        Node a = new Node(11);
        Node b = new Node(21);
        Node c = new Node(51);
        Node d = new Node(101);
        Node e = new Node(111);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;

        System.out.println(a.data);  // a.data = 11
        System.out.println(a.nextNode.data); // b.data = 21
        System.out.println(a.nextNode.nextNode.data); // b.nextNode = c.data = 51
        System.out.println(a.nextNode.nextNode.nextNode.data); //b.nextNode = c.nextNode = d.data = 101
        System.out.println(a.nextNode.nextNode.nextNode.nextNode.data); // b.nextNode = c.nextNode = d.nextNode = e.data = 111
    }
}


