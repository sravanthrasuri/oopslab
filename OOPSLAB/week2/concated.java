package week2;

import java.util.Scanner;

public class concated {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter another string:");
        String b=sc.nextLine();
        System.out.println("Concated string is:"+a.concat(b));
    }
}
