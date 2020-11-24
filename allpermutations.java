import java.util.*;
class allpermutations
{
    public static void printarr(int a[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void heapPermutation(int arr[],int size,int n)
    {
        if(size==1)
            printarr(arr,n);
           
        for(int i=0;i<size;i++)
        {
            heapPermutation(arr,size-1,n);
            if(size%2==1)
            {
                 int temp=arr[size-1];
                 arr[size-1]=arr[0];
                 arr[0]=temp;
            }
            else
            {
                 int temp=arr[size-1];
                 arr[size-1]=arr[i];
                 arr[i]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        heapPermutation(arr,n,n);
    }
}