package week2;
import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String a=sc.nextLine().toLowerCase();
        int vowel=0,consonant=0;
        for(char ch:a.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                vowel++;
            }
            else{
            consonant++;
            }
        }
        System.out.println("Vowel count:"+vowel);
        System.out.println("Consonants count"+consonant);
    }
}