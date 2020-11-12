import java.util.*;
class OneAway
{
    public static boolean onereplace(String s1,String s2,int l)
    {
        boolean diff=false;
        for(int i=0;i<l;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(diff)
                return false;
                else
                diff=true;
            }
        }
        return true;
    }
    public static boolean onechange(String s1,String s2)
    {
        int index1=0;
        int index2=0;
        while(index1<s1.length() && index2<s2.length())
        {
            if(s1.charAt(index1)!=s2.charAt(index2))
            {
                if(index1!=index2)
                    return false;
                
                index2++;    
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }
    public static boolean oneEditaway(String s1, String s2)
    {
        if(s1.length()==s2.length())
        return onereplace(s1,s2,s1.length());
        else if(s1.length()+1==s2.length())
        return onechange(s1,s2);
        else if(s1.length()-1==s2.length())
        return onechange(s2,s1);
        
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str1=sc.nextLine();
        System.out.println("Enter the string..");
        String str2=sc.nextLine();
        boolean ans=oneEditaway(str1,str2);
        System.out.println(ans);
    }
}