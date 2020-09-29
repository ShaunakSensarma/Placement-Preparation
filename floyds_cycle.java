class floyds_cycle
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
    public void push(int ndata)
    {
        Node new_node=new Node(ndata);
        new_node.next=head;
        head=new_node;
    }
    public void detectloop()
    {
        Node slow_p=head;
        Node fast_p=head;
        int flag=0;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null)
        {
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p==fast_p)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Loop detected..");
        else
            System.out.println("No loop detected...");
    }
    public static void main(String args[])
    {
        floyds_cycle ll=new floyds_cycle();
        ll.push(20);
        ll.push(12);
        ll.push(4);
        ll.push(10);
        
        ll.head.next.next.next.next=ll.head;
        ll.detectloop();
    }
}