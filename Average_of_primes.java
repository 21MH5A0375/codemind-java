import java.util.Scanner;
class primeinrange
{
    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
            
        }
        return true;
        }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,x[],count=0;
		float sum=0;
		float a;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		    x[i]=sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	        if(isprime(x[i]))
	        {
	            sum=sum+x[i];
	            count++;
	        }
	    }
	    a=(float)sum/count;
	    System.out.format("%.2f",a);
	}
}
