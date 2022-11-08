import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d,r,sum=0;
        int temp=n;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            sum=sum+(int)Math.pow(r,d);
            d--;
            n=n/10;
            
        }
        if(sum==temp)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}