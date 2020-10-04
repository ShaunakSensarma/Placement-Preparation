import java.util.*;
class anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first word");
        String str1=sc.nextLine();
        System.out.println("Enter second word...");
        String str2=sc.nextLine();
        boolean ans=checkAnagram(str1,str2);
        if(ans==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean checkAnagram(String s1,String s2)
    {
        ArrayList<Character> a=new ArrayList<Character>();
        ArrayList<Character> b=new ArrayList<Character>();
        int len1=s1.length();
        int len2=s2.length();
        if(len1==len2)
        {
            for(int i=0;i<len1;i++)
            {
                char c1=s1.charAt(i);
                a.add(c1);
                char c2=s2.charAt(i);
                b.add(c2);
            }
            Collections.sort(a);
            Collections.sort(b);
            if(a.equals(b))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}