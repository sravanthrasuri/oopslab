import java.util.*;
public class application
{
  public static void main(String[] args)
  {
    int n=5,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    Scanner s=new Scanner(System.in);
    //ArrayList<Integer> numbers=new ArrayList<Integer>();
    int numbers[] =new int[n];
    for(int i=0;i<n;i++)
    {
    numbers[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(numbers[i]<min)
        min=numbers[i];
        if(numbers[i]>max)
        max=numbers[i];
    }
    System.out.println("min value is:"+min);
    System.out.println("max value is:"+max);
    
  }
}
