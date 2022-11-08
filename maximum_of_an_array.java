import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,max;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        max=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]>max)
            max=x[i];
        }
        System.out.println(max);
        
    }
}