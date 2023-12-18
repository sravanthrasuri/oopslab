import java.util.*;
class dupicate
{
   public static void main(String[] args)
   {
     ArrayList<Integer> arr=new ArrayList<>();
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("enter numbers b/w 10 to 100:");
     for(int i=0;i<5;i++)
     {
        n=s.nextInt();
        if(arr.contains(n))
         System.out.println("entered number is already exist , enter another number");
        else{
        arr.add(n);
        System.out.println("number added , next");
        }
     }
     System.out.println(arr);
   }
}
