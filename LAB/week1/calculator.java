import java.util.*;
public class calculator
{
   public static void main(String[] args)
   {
      int a,b;
      char c;
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter a value:");
      a=scanner.nextInt();
      System.out.println("enter b value:");
      b=scanner.nextInt();
      System.out.println("enter the operator:");
      c=scanner.next().charAt(0);
      int sub,mul,div;
      switch(c)
      {
        case '+'://add=a+b;
                 System.out.println("add= "+(a+b));
                 break;
       case '-':sub=a-b;;
                 System.out.println("sub= "+sub);
                 break;
       case '*':mul=a*b;;
                 System.out.println("mul= "+mul);
                 break;
       case '/':div=a/b;;
                 System.out.println("div= "+div);
                 break;
       default: System.out.println("entered operator is not used for any operation ");
                break;
      }
      scanner.close();
   }
}
