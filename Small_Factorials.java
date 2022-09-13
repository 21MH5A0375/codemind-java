import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,prod=1,f=1;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            f=1;
            for(int i=n;i>=1;i--)
            {
                f=f*i;
            }
            System.out.println(f);
            t--;
        }
    }
}