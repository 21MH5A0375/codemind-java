import java.util.Scanner;
class Main
{
    public static int add(int n)
    {
        int r,sum=0;
        while(n>0)
        {

            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+add(x[i]);
        }
        System.out.println(sum);
    }
}