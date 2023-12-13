import java.util.*;
public class palindrome
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number:");
      int n=s.nextInt();
      int temp=n,sum=0,r;
      while(temp!=0)
      {
         r=temp%10;
         sum=sum*10 + r;
         temp=temp/10;
      }
      System.out.println(sum);
     if(n == sum)
      System.out.println("It is a palindrome number");
     else
     System.out.println("It is a not palindrome number");
   }
}
