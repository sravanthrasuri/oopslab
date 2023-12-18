// string reverse
import java.util.*;
class string
   {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
class rev
{
    
    public static void reverse(String name,int idx,String newstr)
    {
       if(idx==0)
       {
       System.out.print(name.charAt(idx));
       newstr+=name.charAt(idx);
       System.out.println();
       System.out.println("reverse string is:"+newstr);
       return ;
       }
       System.out.print(name.charAt(idx));
       newstr+=name.charAt(idx);
       reverse(name,idx-1,newstr);
    }
    public static void main(String[] args)
    {
      Scanner s=new Scanner( System.in);
      String name;
      System.out.println("enter name:");
      name=s.next();
      string obj=new string(name);
      reverse(name,name.length()-1,"");
      
    }
}
