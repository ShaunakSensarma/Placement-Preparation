import java.util.*;
class permutationString2
{
    public static boolean check(char s1[], char s2[],int l)
    {
        int arr[]=new int[123];
        Arrays.fill(arr,0);
        for(char c:s1)
        arr[c]++;
        for(char c1:s2)
        arr[c1]--;
        
        for(int n:arr)
            if(n!=0)
                return false;
        
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string..");
        String str1=sc.nextLine();
        System.out.println("Enter the second string..");
        String str2=sc.nextLine();
        boolean ans=check(str1.toCharArray(),str2.toCharArray(),str1.length());
        if(ans==true)
            System.out.println("Yes, unique..");
        else
            System.out.println("No, not unique");
    }
}