import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n+1;i<m;i++)
        {
            if(prime(i))
            System.out.println(i);
        }
        
    }
}