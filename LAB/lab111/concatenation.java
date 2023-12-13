import java.util.*;

   class string
   {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
 class concatenation
{  
   public static void main(String[] args)
   {
      String n1,n2;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the two stings:");
      n1=s.next();
      n2=s.next();
      string obj1=new string(n1);
     string obj2=new string(n2);
      String a=obj1.s.concat(obj2.s);
      System.out.println(a);
   }
}
