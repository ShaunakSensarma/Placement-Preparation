import java.util.*;
import java.io.*;
class BFSGraph
{
    private int V;
    private LinkedList<Integer> adj[];
    BFSGraph(int v)
    {
        V=v;
        adj=new LinkedList[4];
        for(int i=0;i<V;i++)                               //creating list inside list
        {
            adj[i]=new LinkedList();
        }
    }
    
    void addEdge(int v,int w)               //creating the adjacency list
    {
        adj[v].add(w);
    }
    
    void BFS(int s)
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.print(s+" ");
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
    }
    public static void main(String args[])
    {
        BFSGraph g=new BFSGraph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.BFS(2);
    }
}