class towerOfHanoi
{
    public static void main(String args[])
    {
        int n=4;
        tower(n,'A','C','B');
    }
    public static void tower(int n,char frod,char trod, char arod)
    {
        if(n==1)
        {
            System.out.println("Move disc 1 from rod "+frod+" to rod "+trod);
            return;
        }
        tower(n-1, frod, arod, trod);
        System.out.println("Move disc "+n+" from rod "+frod+" to rod "+trod);
        tower(n-1, arod, trod, frod);
    }
}