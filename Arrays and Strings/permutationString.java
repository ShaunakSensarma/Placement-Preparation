import java.util.*;
class permutationString
{
    public static boolean checkper(char s1[],char s2[],int l)
    {
        //shuffling the arrays...
        for(int i=0;i<l;i++)
        {
            int t=(int)Math.random()*l;
            
            char c1=s1[t];
            s1[t]=s1[i];
            s1[i]=c1;
            
            char c2=s2[t];
            s2[t]=s2[i];
            s2[i]=c2;
        }
        //This shuffling has been done to avoid the worst case time complexity..
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        return (Arrays.equals(s1,s2));
    }
    public static boolean check(String s1, String s2)
    {
       int l1=s1.length();
       int l2=s2.length();
       if(l1==l2)
       {
           boolean ans=checkper(s1.toCharArray(),s2.toCharArray(),l1);
           return ans;
       }
       else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string..");
        String str1=sc.nextLine();
        System.out.println("Enter the second string..");
        String str2=sc.nextLine();
        boolean ans=check(str1,str2);
        if(ans==true)
            System.out.println("Yes, unique..");
        else
            System.out.println("No, not unique");
    }
}