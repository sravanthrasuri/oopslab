package week2;
import java.util.*;
public class startend {
    public static void main(String args[]){
        String a="Hello world!";
        String s=a.substring(3, 8);
        Boolean b=a.startsWith("Hello");
        Boolean c=a.endsWith("World");
        System.out.println("Substring is:"+s);
        System.out.println("Starts with:"+b);
        System.out.println("Ends with:"+c);
    }
}
