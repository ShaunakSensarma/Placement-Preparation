class subsequence
{
    public static void main(String args[])
    {
        String str="aab aaaab";
        int len=str.length();
        int ans=lps(str.toCharArray(),0,len-1);
        System.out.println("Longest palindromic subsequence is.."+ans);
    }
    static int max(int x,int y)
    {
        return (x>y)?x:y;
    }
    static int lps(char seq[],int i,int j)
    {
        if(i==j)
            return 1;
        else if(seq[i]==seq[j] && i+1==j)
            return 2;
        else if(seq[i]==seq[j])
        {
            return lps(seq,i+1,j-1)+2;
        }
        else
        {
            return max(lps(seq,i,j-1),lps(seq,i+1,j));
        }
    }
}