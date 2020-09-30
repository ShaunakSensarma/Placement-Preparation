import java.util.*;
class palinLL
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void add(int d)
    {
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public void palincheck()
    {
       int flag=0;
       Node fast=head;
       Node slow=head;
       Stack<Integer> s=new Stack<Integer>();
       while(fast!=null && fast.next!=null)
       {
           s.push(slow.data);
           slow=slow.next;
           fast=fast.next.next;
       }
       if(fast!=null)
       {
           slow=slow.next;
       }
       while(slow!=null)
       {
           int top=s.pop().intValue();
           if(top!=slow.data)
           {
               flag=1;
               break;
           }
           slow=slow.next;
       }
       if(flag==1)
        System.out.println("Not palindromic...");
       else
        System.out.println("It is palindromic..");
    }
    public static void main(String args[])
    {
        palinLL ll=new palinLL();
        ll.add(25);
        ll.add(12);
        ll.add(8);
        ll.add(4);
        ll.add(8);
        ll.add(12);
        ll.add(25);
        
        ll.printlist();
        
        ll.palincheck();
    }
}