import java.util.Scanner;
class Main
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),lcm,max;
        if(a>b)
        max=a;
        else
        max=b;
        for(int i=max;;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}