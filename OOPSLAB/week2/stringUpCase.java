package week2;
import java.util.*;
public class stringUpCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter another string:");
        String b=sc.nextLine();
        int c=a.compareTo(b);
        if(c<0){
            System.out.println("First comes before second");
        }
        else if(c>0){
            System.out.println("Second comes before first");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
