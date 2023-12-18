import java.util.*;
//package package1;
   public class string
   {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
 class indexof
{  
   public static void main(String[] args)
   {
      String n1,n2;
     // char c;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the statement:");
      n1=s.nextLine();
     /* System.out.println("enter the alphabet to find indexof:");
      c=s.next().charAt(0);*/
      System.out.println("enter the string to search:");
      n2=s.nextLine();
      string obj1=new string(n1);
      
      System.out.println("indexof your string \""+n2+"\" is:"+(obj1.s).indexOf(n2));
   }
}
