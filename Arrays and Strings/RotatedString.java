import java.util.*;
class RotatedString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the main text: ");
        String str=sc.nextLine();
        
        System.out.println("Enter the rotated text: ");
        String s=sc.nextLine();
        
        String x="";
        String y="";
        
        int len=str.length();
        int l=s.length();
        
        if(len!=l)
        {
            System.out.println("No");
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                char k=s.charAt(i);
                if(!str.contains(x+k))
                {
                    y=s.substring(i);
                    break;
                }
                x=x+k;
            }
            if(str.equals(y+x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
    }
}