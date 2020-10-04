import java.util.*;
class insideTriangle
{
    public static double computeArea(int x1,int y1,int x2,int y2,int x3,int y3)
    { 
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
    }
    public static boolean inside(int x1,int y1,int x2,int y2,int x3,int y3,int x,int y)
    {
        double A=computeArea(x1,y1,x2,y2,x3,y3);
        double a=computeArea(x,y,x2,y2,x3,y3);
        double b=computeArea(x1,y1,x,y,x3,y3);
        double c=computeArea(x1,y1,x2,y2,x,y);
        if(A==a+b+c)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        if (inside(0, 0, 20, 0, 10, 30, 10, 15))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
            