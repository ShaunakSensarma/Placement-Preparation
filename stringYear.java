import java.util.*;
class stringYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        System.out.println(checkyear(str,len));
    }
    public static int checkyear(String s,int n)
    {
        ArrayList <String> al=new ArrayList<String>();             //Array List of Collections Framework
        String w="";
        for(int i=0;i<n;i++)
        {
            char k=s.charAt(i);                                   //extracting each character
            w=w+k;                                                //creating the word by concatenation
            if(k==' ' || i==n-1)                                  //check for blank or end of string
            {
                w=w.trim();                                       //removing blank spaces from ends of word
                int len=w.length();
                if(len==4)
                {
                    int flag=0;
                    for(int j=0;j<4;j++)
                    {
                        char k1=w.charAt(j);
                        if(k1>=48 && k1<=57)                     //checking presence of digits using ASCII value of 0-9
                            flag++;
                    }
                    if(flag==4)
                    {
                        if(al.contains(w)==false)                 //check for multiple occurence of years
                        {
                            al.add(w);                            //add year to the Array List
                        }
                    }
                }
                w="";
            }
        }
        int size=al.size();
        return size;                                                 //return to the main function.
    }
}
    