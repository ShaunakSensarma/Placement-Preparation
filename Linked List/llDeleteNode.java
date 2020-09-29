class llDeleteNode
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
    public static void main(String args[])
    {
        llDeleteNode ll=new llDeleteNode();
        ll.push(20);
        ll.push(12);
        ll.push(4);
        ll.push(10);
        ll.printList();
        ll.deleteNode(4);
        System.out.println();
        ll.printList();
    }
    void deleteNode(int d)
    {
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==d)
        {
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=d)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
            return;
        prev.next=temp.next;
    }
}