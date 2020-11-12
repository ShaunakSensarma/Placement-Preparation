import java.util.*;
class uniqueString
{
    public static boolean check(String s)
    {
        char c[]=s.toCharArray();
        HashSet <Character> hs=new HashSet<Character>();
        for (char ch:c)
        {
            if(hs.contains(ch))
            {
                return false;
            }
            else
                hs.add(ch);
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        boolean ans=check(str);
        if(ans==true)
            System.out.println("Yes, unique..");
        else
            System.out.println("No, not unique");
    }
}