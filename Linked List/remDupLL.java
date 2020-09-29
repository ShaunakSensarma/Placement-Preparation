import java.util.*;
class remDupLL
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
    void deleteDups()
    {
        HashSet<Integer> set=new HashSet<Integer>();
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            if(set.contains(temp.data))
            {
                prev.next=temp.next;
            }
            else
            {
                set.add(temp.data);
                prev=temp;
            }
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        remDupLL ll=new remDupLL();
        ll.push(20);
        ll.push(12);
        ll.push(4);
        ll.push(10);
        ll.push(25);
        ll.push(12);
        ll.push(8);
        ll.printList();
        ll.deleteDups();
        System.out.println();
        ll.printList();
    }
    
}