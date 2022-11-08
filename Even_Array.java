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
       
        for(i=0;i<n;i++)
        {
           if(x[i]%2!=0)
           {
             count=1;
           }
        }
        if(count==0)
        System.out.print("True");
        else
        System.out.println("False");
        
    }
}