import java.util.*;
public class maxPieces 
{
	public static int max(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else 
			return c;
	}
	public static int maxPieces(int n,int a,int b,int c)
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res=max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c));
		if(res==-1)
			return -1;
		return res+1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter n: ");
		int n=sc.nextInt();
		System.out.print("\nEnter a: ");
		int a=sc.nextInt();
		System.out.print("\nEnter b: ");
		int b=sc.nextInt();
		System.out.print("\nEnter c: ");
		int c=sc.nextInt();
		
		int ans=maxPieces(n,a,b,c);
		System.out.println("No of max pieces.."+ans);

	}

}
