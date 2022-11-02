import java.util.*;
class Main
{
    public static boolean prime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x[],max=0,min=9999,i1=0,i2=0,count=0;
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(min>x[i])
            {
            min=x[i];
            i1=i;
            }
            if(max<x[i])
            {
                max=x[i];
                i2=i;
            }
        }
        if(i1>i2)
        {
            int temp=i1;
            i1=i2;
            i2=temp;
        }
        for(int i=i1;i<=i2;i++)
        {
            if(prime(x[i]))
            count++;
        }
        System.out.println(count);
        
    }
}