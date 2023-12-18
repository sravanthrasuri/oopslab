import java.util.*;
class sort
{  
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of an array:");
  int n=s.nextInt();
  int t;
      int Array[]=new int[n];
      System.out.println("enter the array elements:");
      for(int i=0;i<n;i++)
      {
         Array[i]=s.nextInt();
      }
      System.out.println("the array elements are:");
      for(int i=0;i<n;i++)
      {
         System.out.println(Array[i]);
      }
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n-i-1;j++)
         {
           if(Array[j]>Array[j+1])
           {
             t=Array[j];
             Array[j]=Array[j+1];
             Array[j+1]=t; 
           }
         }
      }
      System.out.println("sorted array elements are:");
      for(int i=0;i<n;i++)
      {
         System.out.println(Array[i]);
      }
   }

}
