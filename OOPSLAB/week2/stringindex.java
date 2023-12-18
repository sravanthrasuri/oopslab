package week2;
import java.util.Scanner;
public class stringindex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter the character to found:");
        char b=sc.next().charAt(0);
        // Convert the text and the alphabet to lowercase for case-insensitive comparison
        a=a.toLowerCase();
        char c=Character.toLowerCase(b);
        //counting the occurance
        int occurance=0;
        int index=a.indexOf(c);
        while(index!=-1){
            occurance++;
            index=a.indexOf(c,index+1);
        }
        System.out.println("Total occurrences of '" + b + "': " + occurance);
    }
}
