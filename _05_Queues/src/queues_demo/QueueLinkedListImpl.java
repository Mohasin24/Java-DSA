package src.queues_demo;

import java.util.Queue;

public class QueueLinkedListImpl
{
    public static void main(String[] args)
    {
        QueueLL qe = new QueueLL();

        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);

        qe.remove();
        qe.remove();
        qe.remove();
//
        System.out.println(qe.element());

        System.out.println("Size = " + qe.size());

        System.out.println(qe.isEmpty());

        System.out.println(qe);  // display
        qe.remove();

        System.out.println(qe);
        System.out.println("Size = " + qe.size());
    }
}

class QueueLL {
    private int cnt = 0; // Variable to keep track of the number of elements in the queue (size)

    // Inner class for defining the Node of the linked list
    private class Node {
        public Node next; // Reference to the next Node in the linked list
        public int val;   // Value of the Node (element)

        // Constructor to create a new Node with the given value
        public Node(int val) {
            this.val = val;
            this.next = null;
            cnt++; // Increment the count of elements when a new Node is created
        }
    }

    private Node head; // Reference to the first Node (front) of the queue
    private Node tail; // Reference to the last Node (back) of the queue

    // Constructor to initialize an empty queue
    public QueueLL() {
        this.head = null;
        this.tail = null;
    }

    // Method to add an element to the back of the queue
    public void add(int val) {
        Node temp = new Node(val);

        if (head == null) {
            // If the queue is empty, make the new Node both head and tail
            head = temp;
            tail = temp;
        } else {
            // If the queue is not empty, add the new Node to the tail and update tail reference
            tail.next = temp;
            tail = temp;
        }
    }

    // Method to remove and return the element from the front of the queue
    public int remove() {
        if (head == null) {
            // If the queue is empty, return -1 to indicate an empty queue
            return -1;
        }

        int val = head.val; // Retrieve the value of the element at the front (head) of the queue
        Node temp = head.next; // Move head to the next Node to remove the current front Node
        head.next = null; // Detach the old front Node from the linked list
        head = temp; // Update the head reference to the new front Node
        cnt--; // Decrement the count of elements since one element is removed
        return val;
    }

    // Method to return the value of the element at the front of the queue without removing it
    public int element() {
        if (head == null) {
            // If the queue is empty, return -1 to indicate an empty queue
            return -1;
        }

        return head.val;
    }

    // Method to return the number of elements currently in the queue (size)
    public int size() {
        return cnt;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }

    @Override
    // Generate a string representation of the elements in the queue
    public String toString() {
        if (head == null) {
            return "[]"; // Return an empty string for an empty queue
        }

        Node temp = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (temp.next != null) {
            sb.append(temp.val + ", "); // Append the value of the current Node to the StringBuilder
            temp = temp.next; // Move to the next Node in the linked list
        }
        sb.append(temp.val + "]"); // Append the value of the last Node to the StringBuilder

        return sb.toString();
    }
}
