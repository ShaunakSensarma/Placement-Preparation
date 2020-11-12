import java.util.*;
class palpermutation
{
    public static boolean check(char c[],int l)
    {
        HashSet<Character> hs=new HashSet<Character>();
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        int flag=0;
        for(char ch:c)
        {
            if(hs.contains(ch))
            {
                arr[ch-97]--;
            }
            else
            {
                arr[ch-97]++;
                hs.add(ch);
            } 
        }
        for(int n:arr)
            if(n==1)
                flag++;
        if(flag>1)
        return false;
        else 
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine().toLowerCase();
        boolean ans=check(str.toCharArray(),str.length());
        System.out.println(ans);
    }
}