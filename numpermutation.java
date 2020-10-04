import java.util.*;
class numpermutation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number..");
        int n=sc.nextInt();
        permutation(n);
    }
    public static void permutation(int n)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int dup=n;
        while(dup!=0)
        {
            int d=dup%10;
            arr.add(d);
            dup=dup/10;
        }
        int s=arr.size();
        Collections.sort(arr);
        
        //Smallest number
        
        if(arr.get(0)==0)
        {
            int temp=arr.get(0);
            int temp2=arr.get(1);
            arr.remove(0);               //removing 0th element. All elements preceded by 1
            arr.remove(0);               //removing 0th element which was previous 1th element.
            arr.add(0,temp2);            //adding at front
            arr.add(1,temp);             //adding at second postion.
        }
        int num=0;
        for(int i=0;i<s;i++)
        {
            int d=arr.get(i);
            num=num*10+d;
        }
        System.out.println("Number is..."+num);
    }
}