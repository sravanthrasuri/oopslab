import java.util.*;
class uppertolower
{
   public static void main(String[] args)
   {
      String n1,n2;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the uppercase sting:");
      n1=s.next();
      n2=n1.toLowerCase();
      System.out.println(n1);
      
      System.out.println("lowercase:"+n2);
      System.out.println("uppercase:"+n2.toUpperCase());
      System.out.println("length of given string is:"+n1.length()); 
   }
}
