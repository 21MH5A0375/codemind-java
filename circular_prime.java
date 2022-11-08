import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),rev=0,r;
        
        if(!prime(n))
        System.out.println("not prime");
        else if(prime(reverse(n)))
        System.out.println("circular prime");
        else
        System.out.println("prime but not a circular prime");
    }
}