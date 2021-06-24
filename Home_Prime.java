import java.util.*;
public class Home_Prime
{
    int m;
    int n;
    Home_Prime()
    {
        m=0;
        n=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter number");
        n=sc.nextInt();
        HP(n);
    }

    void HP(int n)
    {
        m=0;
        if(n==1)
            System.out.println("Neither Prime nor Composite");
        else
        {
            for(int i=1;i<=n;i++)
            {
                int c=0;
                if(n==1)
                    break;
                if(n%i==0 && isPrime(i)==true)
                {
                    int t=i;
                    while(t>0)
                    {
                        t=t/10;
                        c++;
                    }
                    m=m*(int)(Math.pow(10,c));
                    m+=i;
                    n=n/i;
                    i=1;
                }
           }
        }
        if(isPrime(m)==true)
            display(m);
        else 
            HP(m);
    }

    boolean isPrime(int i)
    {
        int c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    void display(int n)
    {
        System.out.println("Home Prime-\n"+n);
    }

    public static void main(String args[])
    {
        Home_Prime obj=new Home_Prime();
        obj.input();
    }
}      
 