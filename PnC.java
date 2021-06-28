package Practical;
import java.util.*;
public class PnC
{
    int n;
    String s[];
    public PnC(int n)
    {
        this.n=n;
        s=new String[n];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        for(int i=0;i<s.length;i++)
            s[i]=sc.nextLine();
        proccessing(s,0);
    }

    void proccessing(String s[],int ptr)
    {
        if(ptr==n-1)
            display(s);
        else
        {
            int c=ptr+1;
            String s1[]=s;
            while(c<n-1)
            {
                display(s);
                String str=s1[ptr];
                s1[c]=s1[ptr];
                s1[c]=str;
                c++;
            }
            proccessing(s,ptr+1);
        }
    }

    void display(String a[]) 
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
    }

    public static void main(String args[])
    {
        PnC obj=new PnC(3);
        obj.input();       
    }
}
