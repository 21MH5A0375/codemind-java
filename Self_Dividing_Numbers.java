import java.util.Scanner;
class Main
{
    public static boolean self(int n)
    {
        int r;
        int tep=n;
        while(n>0)
        {
          r=n%10;
          if(r!=0)
          {
          if(tep%r!=0)
          {
              return false;
          }
          }
          else
          return false;
          n=n/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int tep=n;
        for(int i=n;i<=m;i++)
        {
            if(self(i))
            System.out.print(i+" ");
        }
    
    }
}