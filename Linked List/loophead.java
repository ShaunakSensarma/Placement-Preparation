public class loophead
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
    Node detecthead(Node temp)
    {
        Node slow=temp;
        Node fast=temp;
        while(fast!=null || fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(slow!=fast)
            return null;
        else
        {
            slow=temp;
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }
    }
    public void main(String[] args) 
    {
        Node head=newNode(10);
        head.next=newNode(20);
        head.next.next=newNode(30);
        head.next.next.next=newNode(40);
        head.next.next.next.next=newNode(40);
        head.next.next.next.next.next=newNode(50);
        head.next.next.next.next.next.next=newNode(60);
        head.next.next.next.next.next.next.next=newNode(70);
        head.next.next.next.next.next.next.next.next=head.next.next.next;
        
        Node ans=detecthead(head);
        if(ans==null)
            System.out.println("Not present");
        else
            System.out.println(ans.data);
    }
}