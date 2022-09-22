import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,k,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        k=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]==k)
           c++;
        }
        System.out.println(c);
    }
}