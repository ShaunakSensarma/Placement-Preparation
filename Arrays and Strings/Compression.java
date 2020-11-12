import java.util.*;
class Compression
{
    public static String compress(String s)
    {
        int arr[]=new int[26];
        int count[]=new int[26];
        Arrays.fill(arr,0);
        HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
        int n=1;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            if(!hm.containsValue(k))
            {
                hm.put(n++,k);
            }
            count[k-97]++;
        }
        for(int i=1;i<n;i++)
        {
            str=str+hm.get(i)+count[hm.get(i)-97];
        }
        return str;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        String ans=compress(str);
        System.out.println(ans);
    }
}