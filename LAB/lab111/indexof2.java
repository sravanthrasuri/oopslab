import java.util.*;
//package string;
 class string
  {
       String s;
       string(String s)
       {
         this.s=s;
       }  
  }
class indexof2
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     String n;
     System.out.println("enter the string:");
     n=s.next();
     string obj=new string(n);
     System.out.println("enter the alphabet:");
     char ch;
     ch=s.next().charAt(0);
     int index=0,i=0,c=0;
     while(i<(obj.s).length())
     {
       int y=(obj.s).indexOf(ch,index);
       if(y!=-1){
        c++;
        index+=1;
        }
       i++;
     }
     System.out.println(c);
  }
}
