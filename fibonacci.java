import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(3<=n)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            n--;
            
        }
        
    }
}