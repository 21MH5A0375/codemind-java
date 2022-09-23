import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,amount;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        amount=p*Math.pow((1+r/100),t);
        System.out.format("%.2f",amount);
    }
}