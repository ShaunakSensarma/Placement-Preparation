import java.util.*;
class kthelement
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
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void findelement(int k)
    {
        Node first=head;
        Node second=head;
        for(int i=0;i<=k;i++)
        {
            second=second.next;
        }
        while(second!=null)
        {
            second=second.next;
            first=first.next;
        }
        System.out.println(first.data);
    }
    public static void main(String args[])
    {
        kthelement el=new kthelement();
        el.add(5);
        el.add(6);
        el.add(7);
        el.add(8);
        el.add(9);
        el.add(10);
        el.add(11);
        el.add(12);
        el.add(13);
        el.add(14);
        el.add(15);
        el.add(16);
        el.add(17);
        el.add(18);
        System.out.println("Displaying the linked list...\n");
        el.display();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the value of k..");
        int k=sc.nextInt();
        
        el.findelement(k);
    }
}