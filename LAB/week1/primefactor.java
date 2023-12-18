import java.util.*;
public class primefactor
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
       int n,c=1,i=1,count=0;
       System.out.println("enter the number:");
       n=scanner.nextInt();
       System.out.println("prime factors are:");
       while(i<n)
       {
         if(n%i == 0)
         { 
            while(i>=c)
            {
               if(i%c==0)
                count++;
                c++;
                //System.out.println(i);
            }
            if(count==2)
            System.out.println(i);
         }
         c=1;
         i++;
         count=0;
       }
    }
}
