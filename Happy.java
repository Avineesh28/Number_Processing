package Practical;
import java.util.*;
public class Happy
{
    int happy(int n)
    {
        if(n<10)
            return n;
        else
            return happy(squareofdigits(n));
    }
    int squareofdigits(int n)
    {
        if(n<10)
            return n*n;
        else
        {
            int t=n%10;
            return t*t+squareofdigits(n/10);
        }
    }
    public static void main(String args[])
    {
        Happy obj=new Happy();
        int n=obj.happy(68);
        if(n==1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}