import java.util.*;
import java.lang.*;
class matrixmultiplication
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      int a1,a2,b1,b2;
      System.out.println("enter row and column size of 1st matrix:");
      a1=s.nextInt();
      a2=s.nextInt();
      System.out.println("enter row and column size of 2nd matrix:");
      b1=s.nextInt();
      b2=s.nextInt();
      if(a2!=b1)
      {
         System.out.println(" multiplication is not posiible ");
      }
      else
      {
      int a[][]=new int[a1][a2];
      int b[][]=new int[b1][b2],c[][]=new int[b1][b2];
       System.out.println("enter 1st matrix elements:");
       for(int i=0;i<a1;i++)
       {
           for(int j=0;j<a2;j++)
           {
              a[i][j]=s.nextInt();
           }
       }
       System.out.println("enter 2nd matrix elements:");
       for(int i=0;i<b1;i++)
       {
           for(int j=0;j<b2;j++)
           {
              b[i][j]=s.nextInt();
           }
       }
       for(int i=0;i<a1;i++)
       {
           for(int j=0;j<b2;j++)
           {
              c[i][j]=0;
              for(int k=0;k<b1;k++)
              {
                 c[i][j]=c[i][j]+a[i][k]*b[k][j];
              }
           }
       }
       System.out.println("2D array elements are:");
       for(int i=0;i<a1;i++)
       {
           for(int j=0;j<b2;j++)
           {
              System.out.print(c[i][j]+" ");
           }
           System.out.println();
       }
       }
   }
}
