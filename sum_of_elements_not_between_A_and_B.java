import java.util.Scanner;
class Main
{
    public static boolean odd(int n)
    {
        if(n%2==1)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n=sc.nextInt(),sum=0,add=0;
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        { 
            if(x[i]<a)
            sum=sum+x[i];
        } 
        for(int i=0;i<n;i++)
        {
            if(x[i]>b)
            add=add+x[i];
        }
      
        System.out.println(add+sum);
    }
}