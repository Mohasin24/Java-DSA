package src.queues_demo;

public class QueueArrayImpl
{
    public static void main(String[] args)
    {
        QueueArr qe = new QueueArr(10);
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);

        System.out.println(qe);

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

class QueueArr {
    private int[] qArr;
    private int start = -1; // Initialize start to -1 to indicate an empty queue
    private int end = -1;   // Initialize end to -1 to indicate an empty queue
    private int len = 0;

    public QueueArr(int size) {
        this.qArr = new int[size];
    }

    // Add an element to the back of the queue
    public void add(int val) {
        if (len == qArr.length) {
            System.out.println("Queue is full!");
            return;
        }

        if (start == -1 && end == -1) {
            // If the queue is empty, set both start and end to the first index
            qArr[++end] = val;
            start = end;
        } else {
            // If the queue is not empty, just increment end and add the element
            qArr[++end] = val;
        }

        len++;
    }

    // Remove and return the element from the front of the queue
    public int remove() {
        if (start == -1 || start > end) {
            // If the queue is empty or start has crossed the end, return -1 to indicate an empty queue
            return -1;
        }

        len--;
        return qArr[start++];
    }

    // Return the element from the front of the queue without removing it
    public int element() {
        if (start == -1 || start > end) {
            // If the queue is empty or start has crossed the end, return -1 to indicate an empty queue
            return -1;
        }

        return qArr[start];
    }

    // Return the number of elements currently in the queue
    public int size() {
        if (start == -1) {
            return 0;
        }

        return len;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        if (start == -1) {
            return true;
        }

        return false;
    }

    @Override
    // Generate a string representation of the elements in the queue
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(qArr[i] + ", ");
        }
        sb.append(qArr[end] + "]");
        return sb.toString();
    }
}
