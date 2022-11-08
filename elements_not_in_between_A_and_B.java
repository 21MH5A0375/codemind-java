import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n=sc.nextInt(),count=0;
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                System.out.print(x[i]+" ");
                count=1;
            }
        } 
        if(count==0)
        System.out.print("-1");
   
    }
}