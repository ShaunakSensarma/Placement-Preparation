import java.util.Arrays;
class coinChange
{
    public static void main(String args[])
    {
        int arr[]={2,3,5,6};
        int m=arr.length;
        int n=10;
        System.out.println("Numbers.."+countWays(arr,m,n));
    }
    public static long countWays(int arr[],int m,int n)
    {
        long table[]=new long[n+1];
        Arrays.fill(table,0);
        table[0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=arr[i];j<=n;j++)
            {
                table[j]+=table[j-arr[i]];
            }
        }
        return table[n];
    }
}
           