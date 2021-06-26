package Practical;
import java.util.*;
public class GoldBach
{
    int N;
    GoldBach()
    {
        N=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        N=sc.nextInt();
        if(N<=9 || N>=50)
        {
            System.out.println("Wrong input,number does not lie between 9 and 50");
            System.exit(0);
        }
        else if(N%2!=0)
        {
            System.out.println("Wrong input,Number is odd");
            System.exit(0);
        }
        else
            System.out.println("PRIME PAIRS ARE");
    }

    void check()
    {
        int sum;
        for(int i=1;i<=N;i+=2)
        {
            sum=0;
            for(int j=i;j<=N;j+=2)
            {
                sum=i+j;
                if(sum==N)
                {
                    if(isPrime(i)==true && isPrime(j)==true)
                        display(i,j);
                    else
                        continue;
                }
                else
                    continue;
            }
        }
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

    void display(int i,int j)
    {
        System.out.println(i+"+"+j);
    }

    public static void main(String args[])
    {
        GoldBach obj=new GoldBach();
        obj.input();
        obj.check();
    }
}