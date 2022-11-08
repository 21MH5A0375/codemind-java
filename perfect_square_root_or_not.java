import java.util.Scanner;
class Main
{
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float d=(float)Math.sqrt(n);
        if(d-(int)d==0)
        System.out.println("True");
        else
        System.out.println("False");
     
    }
    
}