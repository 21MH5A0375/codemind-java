import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,c=0,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2!=0 && x[i]%2!=0)
            {
            count++;
            }
            if(x[i]%2!=0)
            c++;
        }
        if(count==c)
        System.out.println("True");
        else
        System.out.println("False");
    }
}