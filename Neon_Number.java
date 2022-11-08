import java.util.Scanner;
class Main
{
    public static boolean neon(int n)
    {
        int prod,r,sum=0;
        int temp=n;
        prod=n*n;
        while(prod>0)
        {
            r=prod%10;
            sum=sum+r;
            prod=prod/10;
            
        }
        if(sum==temp)
        return true;
        else
        return false;
        
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(neon(n))
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
        
    }
}