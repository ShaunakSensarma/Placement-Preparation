import java.util.*;
class delMidLL
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
    void push(int d)
    {
         Node newnode=new Node(d);
         newnode.next=head;
         head=newnode;
         
    }
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    void deleteNode(Node n)
    {
       Node temp=n;
       if(temp==null || temp.next==null)
           return;
       temp.data=temp.next.data;
       temp.next=temp.next.next;
    }
    public static void main(String args[])
    {
        delMidLL ll=new delMidLL();
        ll.push(20);
        ll.push(12);
        ll.push(4);
        ll.push(10);
        ll.push(25);
        ll.push(8);
        ll.printList();
        ll.deleteNode(ll.head.next.next.next);
        System.out.println();
        ll.printList();
    }
    
}