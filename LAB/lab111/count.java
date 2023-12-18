import java.util.*;

   class string
   {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
 class count
{  
   public static void main(String[] args)
   {
      String n1;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      n1=s.nextLine();
      string obj1=new string(n1);
      int i=0,vc=0,cc=0;
 
      while(i<obj1.s.length())
      {
        if(obj1.s.charAt(i)=='a' || obj1.s.charAt(i)=='e' ||obj1.s.charAt(i)=='i' || obj1.s.charAt(i)=='o' || obj1.s.charAt(i)=='u')
        vc++;
        else
        cc++;
        i++;
      }
     System.out.println("vowel count is:"+vc); 
     System.out.println("consonent count is:"+cc); 
   }
}
