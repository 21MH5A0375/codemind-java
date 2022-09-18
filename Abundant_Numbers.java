import java.util.Scanner;
class AbundantNumber
{
  public static boolean isAbundant(int x)
  {
      int sum=1,i;
	  for(i=2;i<=x/2;i++)
	  {
	      if(x%i==0)
		     sum=sum+i;
	  }
	  if(sum>x)
		return true;
	  else
		return false;
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  if(isAbundant(n))
	    System.out.println("True");
    else
        System.out.println("False");
	  sc.close();
  }
}
