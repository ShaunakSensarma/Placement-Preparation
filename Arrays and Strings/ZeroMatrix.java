import java.util.*;
class ZeroMatrix
{
    static int arr[][];
    static int r,c;
    public static void nullifyRow(int n)
    {
        for(int i=0;i<c;i++)
        {
            arr[n][i]=0;
        }
    }
    public static void nullifyCol(int n)
    {
        for(int i=0;i<r;i++)
        {
            arr[i][n]=0;
        }
    }
    public static void zero()
    {
        boolean row[]=new boolean[r];
        boolean col[]=new boolean[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            if(row[i])
                nullifyRow(i);
        }
        for(int j=0;j<c;j++)
        {
            if(col[j])
                nullifyCol(j);
        }
        display(); 
    }
    public static void display()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value: ");
        r=sc.nextInt();
        System.out.println("Enter row value: ");
        c=sc.nextInt();
        arr=new int[r][c];
        
        System.out.println("Enter "+(r*c)+" values...");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe 2-D matrix...");
        display();
        System.out.println("\nThe zerofied 2-D matrix...");
        zero();
    }
}