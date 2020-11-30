import java.util.*;
import java.lang.*;
import java.io.*;
class CircularRobot {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String dump=sc.nextLine();                         //dump line
		for(int j=1;j<=n;j++)
		{
		    String str=sc.nextLine();
		    boolean ans=check(str.toCharArray());
		    if(ans==true)
		        System.out.println("Circular");
		    else
		        System.out.println("Not Circular");
		}
	}
	public static boolean check(char s[])
	{
	   int x=0;int y=0;int dis=0;
	   int len=s.length;
	   for(int i=0;i<len;i++)
	   {
	        char k=s[i];
	        if(k=='L')
	            dis=(dis+3)%4;
	        else if(k=='R')
	            dis=(dis+1)%4;
	        else
	        {
	            if(dis==0)
	                y++;
	            else if(dis==1)
	                x++;
	            else if(dis==2)
	                y--;
	            else if(dis==3)
	                x--;
	        }
	       
	   }
	   if(x==0 && y==0)
	    return true;
	   else
	    return false;
	}
}