import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,a,b,count=0,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            count=count+x[i];
            if(x[i]>=a && x[i]<=b)
            sum=sum+x[i];
        }
    
            System.out.println(count-sum);
    
    }
}