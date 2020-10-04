class reverseDLL
{
    Node head;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)
        {
            data=d;
            prev=next=null;
        }
    }
    public void add(int d)
    {
        Node newnode=new Node(d);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null)
            head.prev=newnode;
        head=newnode;
    }
    public void reverse()
    {
        Node current=head;
        Node temp=null;
        while(current!=null)
        {
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null)
        {
            head=temp.prev;
        }
    }
    public static void main(String args[])
    {
        reverseDLL link=new reverseDLL();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6);
        
        link.reverse();
    }
}
        