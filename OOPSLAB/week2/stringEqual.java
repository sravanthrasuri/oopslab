package week2;
import java.util.Scanner;
public class stringEqual {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter another string:");
        String b=sc.nextLine();
        if(a.equals(b)){
            System.out.println("Equal (case sensitive)");
        }
        else{
            System.out.println("Not Equal (case sensitive)");
        } 
        if(a.equalsIgnoreCase(b)){
            System.out.println("Equal (case in-sensitive)");
        }
        else{
            System.out.println("Not Equal (case in-sensitive)");
        }
    }
}