class reverseLL
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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void reverse()
    {
        Node temp=head;
        reverseLL ll1=new reverseLL();
        while(temp!=null)
        {
            ll1.add(temp.data);
            temp=temp.next;
        }
        ll1.printlist();
    }
    public static void main(String args[])
    {
        reverseLL ll=new reverseLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        
        ll.printlist();
        System.out.println();
        ll.reverse();
    }
}