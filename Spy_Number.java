import java.util.Scanner;
class Main
{
    public static boolean spy(int n)
    {
        int prod=1,r,count=0;
        
        while(n>0)
        {
            r=n%10;
            prod=prod*r;
            count=count+r;
            n=n/10;
        }
        if(count==prod)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(spy(n))
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}