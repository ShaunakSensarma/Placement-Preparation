class islands
{
    static int ROW=5;
    static int COL=5;
    public static void main(String args[])
    {
         int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
                                  { 0, 1, 0, 0, 1 }, 
                                  { 1, 0, 0, 1, 1 }, 
                                  { 0, 0, 0, 0, 0 }, 
                                  { 1, 0, 1, 0, 1 } }; 
         islands I = new islands(); 
         System.out.println("Number of islands is: " + I.countIslands(M));
    }
    public static int countIslands(int M[][])
    {
        int count=0;
        boolean visited[][]=new boolean[ROW][COL];
        for(int i=0;i<ROW;i++)
        {
            for(int j=0;j<COL;j++)
            {
                if(M[i][j]==1 && !visited[i][j])
                {
                    DFS(M,i,j,visited);
                    ++count;
                }
            }
        }
        return count;
    }
    public static void DFS(int M[][],int i,int j,boolean visited[][])
    {
        int row[]={-1,-1,-1,0,0,1,1,1};
        int col[]={-1,0,1,-1,1,-1,0,1};
        visited[i][j]=true;
        for(int k=0;k<8;k++)
        {
            if(isSafe(M,i+row[k],j+col[k],visited))
            {
                DFS(M,i+row[k],j+col[k],visited);
            }
        }
    }
    public static boolean isSafe(int M[][],int i,int j,boolean visited[][])
    {
        if(i>=0 && i<ROW && j>=0 && j<COL && M[i][j]==1 && visited[i][j]==false)
            return true;
        else
            return false;
    }
}
        