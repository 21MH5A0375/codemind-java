import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=1;i<n-1;i++)
        {
            if(x[i-1]<x[i] && x[i]>x[i+1])
            count++;
            else if(x[i-1]>x[i] && x[i]<x[i+1])
            count++;
        }
        if(count==n-2)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}