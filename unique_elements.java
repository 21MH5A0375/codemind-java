import java.util.Scanner;
class Frequency {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n,i,j,x[],count=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        
        for(i=0;i<n;i++)
        { 
            if(x[i]!=-99)
            {
              for(j=0;j<n;j++)
              {
                if(x[i]==x[j] && i!=j)
                {
                    x[j]=-99;
                }
              }
              //System.out.println(x[i]+" "+count);
            
                 System.out.print(x[i]+" ");
                }
            }
        }



   }
