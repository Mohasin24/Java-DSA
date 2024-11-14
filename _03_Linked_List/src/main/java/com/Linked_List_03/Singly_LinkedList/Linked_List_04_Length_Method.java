package Linked_List_03.Singly_LinkedList;

//import Linked_List_03.Singly_LinkedList.Node;
public class Linked_List_04_Length_Method
{
    public static void main(String[] args)
    {
        Node a = new Node(11);
        Node b = new Node(21);
        Node c = new Node(51);
        Node d = new Node(101);
        Node e = new Node(111);
        Node f = new Node(151);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        System.out.println("Length : " + linkedListLength(a));
        System.out.println("Length Recursion : " + linkedListLengthRecursively(a));
    }

    public static int linkedListLength(Node node)
    {
        int cnt = 0;
        while (node != null)
        {
            cnt++;
            node = node.nextNode;
        }
        return cnt;
    }

    public static int linkedListLengthRecursively(Node node)
    {
        if(node == null) return 0;

        return 1 + linkedListLengthRecursively(node.nextNode);
    }
}


