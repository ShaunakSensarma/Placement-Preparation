class knapsack
{
    public static void main(String args[])
    {
        int val[]={60,100,120};
        int w[]={10,20,30};
        int W=50;
        int n=val.length;
        System.out.println(knap(val,w,W,n));
    }
    public static int knap(int val[],int w[],int W,int n)
    {
        int i,j;
        int k[][]=new int[n+1][W+1];
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                {
                    k[i][j]=0;
                }
                else if(w[i-1]<=j)
                {
                    k[i][j]=max(val[i-1]+k[i-1][j-w[i-1]],k[i-1][j]);
                }
                else
                {
                    k[i][j]=k[i-1][j];
                }
            }
        }
        return k[n][W];
    }
    public static int max(int a,int b)
    {
        return (a>b)?a:b;
    }
}
        