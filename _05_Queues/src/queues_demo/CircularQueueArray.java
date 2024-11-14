package src.queues_demo;

public class CircularQueueArray
{
    public static void main(String[] args) throws Exception
    {

        CircularQueue qe = new CircularQueue(5);

        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe);
        qe.remove();
        System.out.println(qe);
        System.out.println(qe.size());
        qe.add(101);
        System.out.println(qe);
        qe.remove();
        qe.remove();
        qe.remove();
//        qe.remove();
//        qe.remove();
        System.out.println(qe);
//
        System.out.println(qe.element());

        System.out.println("Size = " + qe.size());

        qe.add(101);

        System.out.println(qe.isEmpty());

        System.out.println(qe);  // display
        qe.remove();

        System.out.println(qe);
        System.out.println("Size = " + qe.size());

    }
}

class CircularQueue
{
    private int[] qArr;
    private int cnt = 0;
    private int arrLen = 0;
    private int start = -1;
    private int end = -1;

    public CircularQueue(int size)
    {
        this.qArr = new int[size];
        this.arrLen = size;
    }

    public void add(int val) throws Exception
    {
        // check & return
        if(cnt == arrLen)
        {
            throw new Exception("Queue is full!");
        }

        // else work
        if(cnt == 0)
        {
            start = end = -1;
            qArr[++end] = val;
            start = end;
        }
        else if(end == arrLen-1)
        {
            end = 0;
            qArr[end] = val;
        }
        else
        {
            qArr[++end] = val;
        }
        cnt++;
    }

    public int remove() throws Exception
    {
        if(cnt == 0)
        {
            throw  new Exception("Queue is empty!");
        }

        int val = val = qArr[start];

        if(start < arrLen-1)
        {
            start++;
        }
        else if(start == arrLen-1)
        {
            start = 0;
        }

        cnt--;

        return val;
    }

    public int element() throws Exception
    {
        if(cnt == 0)
        {
            throw  new Exception("Queue is empty!");
        }

        return qArr[start];
    }

    public boolean isEmpty()
    {
        if(cnt == 0)
        {
            return true;
        }
        return false;
    }

    public int size()
    {
        return cnt;
    }

    @Override
    public String toString()
    {
        if(cnt == 0)
        {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        if(start <= end)
        {
            for (int i = start; i<end; i++)
            {
                sb.append(qArr[i] + ", ");
            }
            sb.append(qArr[end] + "]");
        }
        else if(end < start)
        {
            for (int i = start; i<arrLen; i++)
            {
                sb.append(qArr[i] + ", ");
            }

            for (int i = 0; i<end; i++)
            {
                sb.append(qArr[i] + ", ");
            }
            sb.append(qArr[end] + "]");
        }

        return sb.toString();
    }
}
