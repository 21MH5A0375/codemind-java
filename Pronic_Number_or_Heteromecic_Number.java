import java.util.Scanner;
class Main
{
    public static boolean pronic(int n)
    {
        int x=(int)Math.sqrt(n);
        if(x*(x+1)==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      n=sc.nextInt();
      if(pronic(n))
      System.out.println("YES");
      else
      System.out.println("NO");
    }
}