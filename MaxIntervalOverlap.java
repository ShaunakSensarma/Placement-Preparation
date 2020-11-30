import java.util.*;
import java.lang.*;
import java.io.*;
class MaxIntervalOverlap
{
    public static void maxguests(int a[],int e[],int n)
    {
        int i=1;int j=0;
        int time=a[0];
        int maxg=1;
        int guests=1;
        
        while(i<n && j<n)
        {
            if(a[i]<=e[j])
            {
                guests++;
                if (guests>maxg)
                {
                    time=a[i];
                    maxg=guests;
                }
                i++;
            }
            else
            {
                j++;
                guests--;
            }
        }
        System.out.println(maxg+" "+time);
    }
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int s=sc.nextInt();
		    int start[]=new int[s];
		    int end[]=new int[s];
		    for(int j=0;j<s;j++)
		    {
		        start[j]=sc.nextInt();
		    } 
		    for(int j=0;j<s;j++)
		    {
		        end[j]=sc.nextInt();
		    } 
		    Arrays.sort(start);
		    Arrays.sort(end);
		    maxguests(start,end,s);
		}
	}
}