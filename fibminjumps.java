import java.util.*;
class fibminjumps
{
    public static void main(String args[])
    {
        Stack<Integer> fib=new Stack<Integer>();
        fib.add(1);
        fib.add(2);
        int fn=1;
        int sn=2;
        for(;;)
        {
            int tn=fn+sn;
            if(tn>30)
                break;
            fib.add(tn);
            fn=sn;
            sn=tn;
        }
        int arr[]={0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1,0,0,0,1};
        int end=arr.length;
        int start=-1;
        int count=0;
        while(start<end)
        {
            Iterator<Integer> i=fib.iterator();
            while(i.hasNext())
            {
                int n=i.next();
                int val=start+n;
                if(val==end)
                {
                    count++;
                    start=end;
                    break;
                }
                else if(val<end)
                {
                    int num=arr[val];
                    if(num==1)
                    {
                        count++;
                        start=val;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}