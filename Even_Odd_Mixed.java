import java.util.Scanner;;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,r,c=0,f=0;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                c++;
            }
            else if(r%2!=0)
            {
                f++;
            }
            n=n/10;
        }
        if(d==c)
            System.out.println("Even");
        else if(d==f)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}