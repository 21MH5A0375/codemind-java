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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,count=0;
        m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
            if(!prime(i))
            count++;
            }
            
        }
        System.out.println(count);
    }
    
}