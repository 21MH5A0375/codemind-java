import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,d,s;
        int temp=n;
        d=(int)Math.log10(n)+1;
        r=n*n;
        s=r%(int)Math.pow(10,d);
        if(s==temp)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}