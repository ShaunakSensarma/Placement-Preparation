class intersectionLL
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
    Node newNode(int d)
    {
        Node newn = new Node(d);
        return newn;
    }
    Node intersect(Node t1,Node t2)
    {
        Node temp1=t1;
        Node temp2=t2;
        int cn1=0;
        int cn2=0;
        
        while(temp1!=null)
        {
            cn1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            cn2++;
            temp2=temp2.next;
        }
        temp1=t1;
        temp2=t2;
        if(cn1>cn2)
        {
            int diff=cn1-cn2;
            for(int i=1;i<=diff;i++)
                temp1=temp1.next;
        }
        else
        {
            int diff=cn2-cn1;
            for(int i=1;i<=diff;i++)
                temp2=temp2.next;
        }
        while(temp1!=null)
        {
            if(temp1==temp2)
                break;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
    public void main(String[] args) 
    {
        Node head1=newNode(10);
        head1.next=newNode(20);
        head1.next.next=newNode(30);
        head1.next.next.next=newNode(40);
        head1.next.next.next.next=newNode(50);
        head1.next.next.next.next.next=newNode(60);
        head1.next.next.next.next.next.next=newNode(70);
        head1.next.next.next.next.next.next.next=newNode(80);
        head1.next.next.next.next.next.next.next.next=newNode(90);
        
        Node head2=new Node(90);
        head2.next=new Node(100);
        head2.next.next=head1.next.next.next.next;
        
        Node ans=intersect(head1,head2);
        if(ans==null)
            System.out.println("No intersection");
        else
            System.out.println(ans.data);
    }
}