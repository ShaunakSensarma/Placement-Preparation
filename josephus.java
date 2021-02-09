
public class josephus 
{
	public static int Jos(int N,int K)
	{
		if(N==1)
			return 0;
		return (Jos(N-1,K)+K)%N;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=7;
		int k=4;
		int ans=Jos(n,k);
		System.out.println(ans);
	}

}
