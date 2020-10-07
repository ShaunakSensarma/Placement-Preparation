import java.util.*;
class pqueue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(25);
        pq.add(15);
        System.out.println(pq);
        Iterator<Integer> i=pq.iterator();
        while(i.hasNext())
        {
            int n=i.next();
            System.out.println(n);
        }
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}