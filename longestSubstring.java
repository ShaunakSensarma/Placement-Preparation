import java.util.*;
class longestSubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("Longest Substring length : "+lswrc(s.toCharArray(),l));
    }
    public static int lswrc(char arr[],int n)
    {
        int max=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            ArrayList<Character> al=new ArrayList<Character>();
            int len=0;
            System.out.println(i);
            for(j=i;j<n;j++)
            {
                char k=arr[j];
                if(al.contains(k)==false)
                {
                    al.add(k);
                    len++;
                }
                else
                {
                    if(len>max)
                        max=len;  
                    break;   
                }
            }
        }
        return max;
    }
}