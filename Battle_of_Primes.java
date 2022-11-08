import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
    int i,count=0;
    for(i=2;i<=(int)Math.sqrt(n);i++)
    {
        if(n%i==0)
        count++;
        
        
    }
    if(count==0)
    return true;
    else
    return false;
    }
   public static void main(String args[])
   {
       int a,b,c,n=0;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=a+b;
       for(int i=1;;i++)
       {
           n++;
           if(prime(c+i))
           
           {
               
               System.out.println(n);
              
               break;
               
           }
       }
       
   }
}