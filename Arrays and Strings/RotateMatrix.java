import java.util.*;
class RotateMatrix
{
    public static void rotate(int arr[][],int n)
    {
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            int cn=0;
            for(int j=n-1;j>=0;j--)
            {
                a[cn++][i]=arr[i][j];
            }
            
        }
        display(a,n); 
    }
    public static void display(int arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        
        int arr[][]=new int[n][n];
        
        System.out.println("Enter "+(n*n)+" values...");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe 2-D matrix...");
        display(arr,n);
        System.out.println("\nThe 90 degrees rotated 2-D matrix...");
        rotate(arr,n);
    }
}