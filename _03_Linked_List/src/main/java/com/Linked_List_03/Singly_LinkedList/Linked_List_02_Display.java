package Linked_List_03.Singly_LinkedList;

public class Linked_List_02_Display
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

        displayLL(a);
    }

    static void displayLL(Node node)
    {
        Node temp = node;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.nextNode; // temp = a; temp = a.next; temp = b;
        }
    }
}
