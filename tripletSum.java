import java.io.*;
import java.math.*;
class tripletSum
{
    public static void main(String args[])
    {
        int arr[]={2,5,3,1,4,9};
        int n=arr.length;
        System.out.println(maxtripletsum(arr,n));
    }
    public static int maxtripletsum(int arr[],int n)
    {
        int ans=0;
        for(int i=1;i<n-1;i++)
        {
            int max1=0,max2=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {
                    max1=Math.max(max1,arr[j]);
                }
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    max2=Math.max(max2,arr[j]);
                }
            }
            if(max1>0 && max2>0)
            {
                ans=Math.max(ans,max1+arr[i]+max2);
            }
        }
        return ans;
    }
}