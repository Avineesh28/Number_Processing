import java.util.*;
public class Bouncy_number
{
    int m,n;
    Bouncy_number()
    {
        m=n=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter range");
        m=sc.nextInt();
        n=sc.nextInt();
    }

    void check()
    {
        int c=0;
        for(int i=m;i<=n;i++)
        {
            if(isBouncy(i)==true)
            {
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Frequency-"+c);
    }

    Boolean isBouncy(int n)
    {
        if(n<100)
            return false;
        else
        {
            String s=Integer.toString(n);
            String s1,s2;
            s1=s2="";
            for(char c='1';c<='9';c++)
            {
                for(int i=0;i<s.length();i++)
                {
                    char c1=s.charAt(i);
                    if(c1==c)
                        s1=s1+c1;
                }
            }
            for(char c='9';c>='1';c--)
            {
                for(int i=0;i<s.length();i++)
                {
                    char c2=s.charAt(i);
                    if(c2==c)
                        s2=s2+c2;
                }
            }
            if(s1.equals(s)==true || s2.equals(s)==true)
                return true;
            else
                return false;
        }
    }

    public static void main(String args[])
    {
        Bouncy_number obj=new Bouncy_number();
        obj.input();
        obj.check();
    }
}

