import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,a,b,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int max=0;
        for(i=0;i<n;i++)
        {
           if(x[i]<a || x[i]>b)
           {
             if(x[i]>max)
             {
             max=x[i];
             count=1;
             }
           }
        }
        if(count==1)
        System.out.println(max);
        else
        System.out.println("-1");
        
    }
}