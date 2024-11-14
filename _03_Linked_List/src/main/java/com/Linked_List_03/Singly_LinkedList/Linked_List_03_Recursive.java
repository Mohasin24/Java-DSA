package Linked_List_03.Singly_LinkedList;

public class Linked_List_03_Recursive
{
    public static void main(String[] args)
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

        displayRecursively(a);
        System.out.println();
        displayReverseRecursively(a);
    }

    public static void displayRecursively(Node node)
    {
        Node temp = node;

        if(temp==null) return;

        System.out.print(temp.data + " ");
        displayRecursively(temp.nextNode);
    }
    public static void displayReverseRecursively(Node node)
    {
        Node temp = node;

        if(temp==null) return;
        displayReverseRecursively(temp.nextNode);
        System.out.print(temp.data + " ");

    }

    // function stack
    //displayReverseRecursively(null);     -> 6
    //displayReverseRecursively(111);     -> 5
    //displayReverseRecursively(101);    -> 4
    //displayReverseRecursively(51);    -> 3
    //displayReverseRecursively(21);    -> 2
    //displayReverseRecursively(11);   -> 1
}
