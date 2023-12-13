import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter n:");
      int n,c=1,sum;
      n=s.nextInt();
      sum=n;
      while(c<n)
      {
         sum=sum*c;
         c++;
      }
      System.out.println("factorial of:"+n+" is:"+sum);
    }
    
}
