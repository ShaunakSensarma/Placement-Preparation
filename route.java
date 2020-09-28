import java.util.*;
import java.io.*;
class route
{
    int V;
    LinkedList<Integer> adj[];
    route(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    void BFS(int s,int e)
    {
        int cn=0;
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            if(s==e)
            {
                System.out.println("Route is present...");
                cn=1;
                break;
            }
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
        if(cn==0)
            System.out.println("Route is not present.");
    }
    public static void main(String args[])
    {
        route g=new route(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println("Enter starting value....");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter ending value...");
        int e=sc.nextInt();
        g.BFS(s,e);
    }
}