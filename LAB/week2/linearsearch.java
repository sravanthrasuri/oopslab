import java.util.*;
class linearsearch
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,se,flag=0,i;
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
         if(a[i]==se)
          {
            flag=1;
          
            break;
          }
       }
      if(flag==1)
      System.out.println("the elemnt found at index:"+i);
      else
      System.out.println("the element not found:");
  }
}
