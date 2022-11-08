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
    public static boolean palin(int n)
    {
        int r,temp=n,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        if(temp==sum)
        return true;
        else 
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        for(int i=m+1;;i++)
        {
            if(prime(i) && palin(i))
            {
            System.out.println(i);
            break;
            }
        }
    }
    
}