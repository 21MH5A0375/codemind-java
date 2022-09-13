import java.util.Scanner;
class main
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,n;
        n=sc.nextInt();
        while(true)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+r;
                n=n/10;
            }
            if(sum<=9)
            {
                break;
            }
            else
            n=sum;
        }
        System.out.println(sum);
    }
}