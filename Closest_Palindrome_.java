import java.util.Scanner;
class Palindrome
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
        if(sum==temp)
           return true;
        else
           return false;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isPalindrome(i))
            {
                d1=i;
                break;
            }
            
        }
        for(int i=n-1;;i--)
        {
            if(isPalindrome(i))
            {
                d2=i;
                break;
            }
        }
        if((d1-n)<(n-d2))
            System.out.println(d1);
        else if((d1-n)==(n-d2))
            System.out.println(d2+" "+d1);
        else
            System.out.println(d2);
    }
}