package week2;
import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String a=sc.nextLine();
        System.out.println("Original String:"+a);
        char ch;
        String nstr="";
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed String is:"+nstr);
    }
}
