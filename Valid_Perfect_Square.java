import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t,res;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            n=Math.abs(n);
            res=(int)Math.sqrt(n);
            
            if(res*res==n)

            System.out.println("True");
        else
            System.out.println("False");
            
        t--;
        }
    }
}