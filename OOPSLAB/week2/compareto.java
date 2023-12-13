package week2;
import java.util.*;
class compareto
{
   public static void main(String[] args)
   {
      String n1,n2;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the two strings:");
      n1=s.next();
      n2=s.next();
      if(n1.compareTo(n2)==0)
      System.out.println("entered strings are same");
      else
      System.out.println("entered strings are not same");
   }
}

