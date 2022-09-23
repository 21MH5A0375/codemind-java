import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,amount;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        amount=p*r*t/100;
        System.out.println(amount);
    }
}