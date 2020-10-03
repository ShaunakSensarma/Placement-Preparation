class doublyLL
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
            prev=null;
            next=null;
        }
    }
    public void add(int d)
    {
        Node newnode=new Node(d);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null);
            head.prev=newnode;
        head=newnode;    
    }
    public static void main(String args[])
    {
        doublyLL list=new doublyLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }
}
        