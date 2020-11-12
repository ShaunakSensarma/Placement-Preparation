import java.util.*;
class URLify
{
    public static void convertURL(char c[],int l)
    {
        int b=0;
        for(char k:c)
            if(k==' ')
                b++;
        int nl=l+b*2;
        char c1[]=new char[nl];
        for(int i=l-1;i>=0;i--)
        {
            if(c[i]==' ')
            {
                c1[nl-1]='0';
                c1[nl-2]='2';
                c1[nl-3]='%';
                nl=nl-3;
            }
            else
            {
                c1[nl-1]=c[i];
                nl--;
            }
        }
        for(char k:c1)
            System.out.print(k);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        convertURL(str.toCharArray(),str.length());
    }
}