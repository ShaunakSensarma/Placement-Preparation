class addLL
{
    Node head1;
    Node head2;
    Node head3;
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
    public void add(int d1,int d2)
    {
        Node newnode1=new Node(d1);
        newnode1.next=head1;
        head1=newnode1;
        
        Node newnode2=new Node(d2);
        newnode2.next=head2;
        head2=newnode2;
    }
    public void printlist()
    {
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null)
        {
            System.out.print(temp1.data+" -> ");
            temp1=temp1.next;
        }
        System.out.println();
        while(temp2!=null)
        {
            System.out.print(temp2.data+" -> ");
            temp2=temp2.next;
        }
    }
    public void sum()
    {
       int num1=0; int num2=0; 
       Node temp1=head1;
       Node temp2=head2;
       while(temp1!=null && temp2!=null)
       {
           if(temp1==null)
           {
              num2=num2*10+temp2.data;
              temp2=temp2.next;
           }
           else if(temp2==null)
           {
              num1=num1*10+temp1.data;
              temp1=temp1.next;
           }
           else
           {
              num1=num1*10+temp1.data;
              num2=num2*10+temp2.data;
              temp1=temp1.next;
              temp2=temp2.next;
           }
       }
       num1=reverse(num1);
       num2=reverse(num2);
    
       int sum=num1+num2;
       
       sum=reverse(sum);
       while(sum!=0)
       {
           int d=sum%10;
           Node newnode3=new Node(d);
           newnode3.next=head3;
           head3=newnode3;
           sum=sum/10;
       }
       Node temp3=head3;
       System.out.println();
       while(temp3!=null)
       {
            System.out.print(temp3.data+" -> ");
            temp3=temp3.next;
       }
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        addLL ll=new addLL();
        ll.add(5,2);
        ll.add(2,3);
        ll.add(7,9);
        
        
        ll.printlist();
        
        ll.sum();
    }
}