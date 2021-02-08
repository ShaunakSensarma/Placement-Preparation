import java.util.*;
public class allsubsets
{
	public static void allsubs(String s,String b,int i,int n)
	{
		if(i==n)
		{
			System.out.println(b);
			return;
		}
		allsubs(s,b,i+1,n);
		allsubs(s,b+s.charAt(i),i+1,n);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter word: ");
		String str=sc.nextLine();
		int len=str.length();
		allsubs(str,"",0,len);
	}

}
