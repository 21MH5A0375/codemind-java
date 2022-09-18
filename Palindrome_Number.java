import java.util.Scanner;
class Main
{
   public static boolean isPalindrome(int n)
   {
         int temp=n,r,sum=0;
		 while(n>0)
		 {
		     r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
        if(temp==sum)
           return true;
        else
           return false;

    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t,a;
       t=sc.nextInt();
       while(t>0)
       {
           a=sc.nextInt();
           if(isPalindrome(a))
               System.out.println("True");
            else
                System.out.println("False");
                
       }

   }
}
