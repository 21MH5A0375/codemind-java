import java.util.Scanner;
class ReverseNumber
{
  public static int findReverse(int n)
  {
     //write the logic
	 int sum=0,r;
	 while(n>0)
	 {
	    r=n%10;
		sum=sum*10 + r;
		n=n/10;
	 }
	 return sum;
	 
  } 
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n,res;
	  n=sc.nextInt();
	  res=findReverse(n);
	  
	  System.out.println(res);
  }
}