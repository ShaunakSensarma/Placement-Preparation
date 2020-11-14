import java.util.*;
class QueueLL
{
    qNode first;
    qNode last;
    class qNode
    {
        int data;
        qNode next;
        qNode(int d)
        {
            data=d;
        }
    }
    public void add(int d)
    {
        qNode newnode=new qNode(d);
        if(last!=null)
        {
            last.next=newnode;
        }
        last=newnode;
        if(first==null)
        {
            first=last;
        }
    }
    public int remove()
    {
        if(first==null)
            throw new NoSuchElementException();
        int data=first.data;
        first=first.next;
        if(first==null)
            last=null;
        return data;
    }
    public void peek()
    {
        if(first==null)
            throw new NoSuchElementException();
        int data=first.data;
        System.out.println("Front element is.."+data);
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void main(String args[])
    {
        QueueLL q=new QueueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        int ans=q.remove();
        System.out.println(ans);
        ans=q.remove();
        System.out.println(ans);
        q.add(70);
        q.peek();
        q.isEmpty();
    }
}