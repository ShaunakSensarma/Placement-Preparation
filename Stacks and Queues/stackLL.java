import java.io.*;
import java.util.*;
class stackLL
{
    stackNode top;
    class stackNode
    {
        int data;
        stackNode next;
        stackNode(int d)
        {
            this.data=d;
        }
    }
    int pop()
    {
        if(top==null)
            throw new EmptyStackException();
        int item=top.data;
        top=top.next;
        return item;
    }
    void push(int d)
    {
        stackNode newnode=new stackNode(d);
        newnode.next=top;
        top=newnode;
    }
    int peek()
    {
        if(top==null)
            throw new EmptyStackException();
        return top.data;
    }
    public static void main(String args[])
    {
        stackLL s=new stackLL();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        for(int i=1;i<=5;i++)
        {
            int ans=s.pop();
            System.out.println(ans);
        }
    }
}