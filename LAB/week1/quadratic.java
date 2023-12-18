import java.util.*;
public class quadratic
{
   public static void main(String[] args)
   {
      double a,b,c,d;
      double x,y;
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("enter xsquare coefficient:");
      a=scanner.nextInt();
       System.out.println("enter x coefficient:");
      b=scanner.nextInt();
      System.out.println("enter constant:");
      c=scanner.nextInt();
      System.out.println("quadratic expression is:"+a+"x2+"+b+"x+"+c);
      d=(b*b)-4*a*c;
      System.out.println("delta:"+d);
      if(d<0)
      {
         x=-b/(2*a);
         y= Math.sqrt(-(d))/(2*a);
         System.out.printf("1st root is:%f+i%f\n",x,y);
         System.out.printf("1st root is:%f-i%f\n",x,y);
      }
      else if(d>0)
      {
         x=(-b/(2*a))+(Math.sqrt(d)/(2*a));
         y=(-b/(2*a))-(Math.sqrt(d)/(2*a));
         System.out.printf("1st root is:%f\n",x);
         System.out.printf("1st root is:%f\n",y);
      }
      else
      {
         x=-b/(2*a);
         System.out.printf("equal roots are:%f and %f\n",x,x);
   
      }
   }
}
