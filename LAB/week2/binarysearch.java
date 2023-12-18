import java.util.*;
class binarysearch
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,se,flag=0,i,t,mid=0;
    System.out.println("enter n:");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("enter arr elements:");
    for(i=0;i<n;i++)
      {
         a[i]=s.nextInt();
      }
      System.out.println("the array elements are:");
      for(i=0;i<n;i++)
      {
         System.out.println(a[i]);
      }
      System.out.println("enter search element:");
      se=s.nextInt();
       for(i=0;i<n;i++)
      {
         for(int j=0;j<n-i-1;j++)
         {
           if(a[j]>a[j+1])
           {
             t=a[j];
             a[j]=a[j+1];
             a[j+1]=t; 
           }
         }
      }
      System.out.println("sorted array elements are:");
      for(i=0;i<n;i++)
      {
         System.out.println(a[i]);
      }
      int low=0,high=n-1;
      while(low<=high)
      {
         mid=(low+high)/2;
         if(se==a[mid])
         {
            flag=1;
            break;
         }
         else if(se>a[mid])
         low=mid+1;
         else if(se<a[mid])
         high=mid-1; 
      }
      
      if(flag==1)
      System.out.println("the elemnt found at index:"+mid);
      else
      System.out.println("the element not found:");
  }
}
