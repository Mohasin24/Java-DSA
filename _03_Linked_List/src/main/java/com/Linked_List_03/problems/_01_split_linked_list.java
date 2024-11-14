package com.Linked_List_03.problems;

/*
Problem Statement :
Given a linked list, split it into two list such that one contains odd values
while the other contains even

3->5->4->1->2->8->10->13
3->5->1->13->4->2->8->10
 */

public class _01_split_linked_list
{
    public static void display(_01_Node head)
    {
        _01_Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        _01_Solution sl = new _01_Solution();
        _01_Node a = new _01_Node(3);
        _01_Node b = new _01_Node(5);
        _01_Node c = new _01_Node(4);
        _01_Node d = new _01_Node(1);
        _01_Node e = new _01_Node(2);
        _01_Node f = new _01_Node(8);
        _01_Node g = new _01_Node(10);
        _01_Node h = new _01_Node(13);
        _01_Node i = new _01_Node(21);
        _01_Node j = new _01_Node(18);
        _01_Node k = new _01_Node(25);
        _01_Node l = new _01_Node(12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;

        display(sl.splitLL(a));
    }
}

class _01_Solution
{
    private _01_Node oddHead = null;
    private _01_Node oddTemp = null;
    private _01_Node evenHead = null;
    private _01_Node evenTemp = null;

    public _01_Node splitLL(_01_Node head)
    {
        _01_Node temp = head;

        while (temp != null)
        {
            if (temp.val%2==0)
            {
                if(evenHead == null)
                {
                    evenTemp = temp;
                    evenHead = evenTemp;
                }
                else
                {
                    evenTemp.next = temp;
                    evenTemp = temp;
                }
            }
            else
            {
                if(oddHead==null)
                {
                    oddTemp = temp;
                    oddHead = oddTemp;
                }
                else
                {
                    oddTemp.next = temp;
                    oddTemp = temp;
                }
            }
            temp = temp.next;
        }
        evenTemp.next = null;
        oddTemp.next = evenHead;

        return oddHead;
    }

    private void display(_01_Node head)
    {
        _01_Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

//class _01_Solution
//{
//    private _01_Node oddHead = new _01_Node(-1);
//    private _01_Node oddTemp = oddHead;
//    private _01_Node evenHead = new _01_Node(0);
//    private _01_Node evenTemp = evenHead;
//
//    public _01_Node splitLL(_01_Node head)
//    {
//        _01_Node temp = head;
//
//        while (temp != null)
//        {
//            if (temp.val%2==0)
//            {
//                evenTemp.next = temp;
//                evenTemp = evenTemp.next;
//            }
//            else
//            {
//                oddTemp.next = temp;
//                oddTemp = oddTemp.next;
//            }
//            temp = temp.next;
//        }
//
//         oddHead = oddHead.next;
//        evenHead = evenHead.next;
//        evenTemp.next = null;
//        oddTemp.next = evenHead;
//
//        return oddHead;
//    }
//}

class _01_Node
{
    public int val;
    public _01_Node next;
    public _01_Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}