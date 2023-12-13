import java.util.*;
//import package1.string;
   class string
   {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
 class endswith
{  
   public static void main(String[] args)
   {
      String n1,s1,s2;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      n1=s.nextLine();
      string obj1=new string(n1);
      System.out.println("enter the string of starting:");
      s1=s.next();
      if(obj1.s.startsWith(s1))
      System.out.println("yes,your string is starting with:"+s1);
      else
      System.out.println("no,your string is not starting with:"+s1);
      System.out.println("enter the string of ending:");
      s2=s.next();
      if(obj1.s.endsWith(s2))
      System.out.println("yes,your string is ending with:"+s2);
      else
      System.out.println("no,your string is not ending with:"+s2);
   }
}
