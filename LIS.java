import java.util.*;
class LIS
{
    public static void main(String args[])
    {
        int arr[]={10,22,9,33,21,50,41,60,70};
        int n=arr.length;
        System.out.println(sub(arr,n));
    }
    public static int sub(int arr[],int n)
    {
        int i,j,max=0;
        int lis[]=new int[n];
        Arrays.fill(lis,1);
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(arr[j]<arr[i] && lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                }
            }
        }
        max=Arrays.stream(lis).max().getAsInt();
        return max;
    }
}