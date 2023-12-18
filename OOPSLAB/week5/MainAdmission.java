import admission.EligibilityCheck;
import admission.Engineering;
import java.util.*;
public class MainAdmission{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maths marks:");
        int mathsMarks = sc.nextInt();

        System.out.println("Enter Physics marks:");
        int physicsMarks = sc.nextInt();

        System.out.println("Enter Chemistry marks:");
        int chemistryMarks = sc.nextInt();

        System.out.println("Enter English marks:");
        int englishMarks = sc.nextInt();

        EligibilityCheck a=new Engineering();
        if(a.CheckEligibility(mathsMarks,physicsMarks,chemistryMarks,englishMarks)){
            System.out.println("Congratulations! You are eligible for Engineering Admission.");
        }
        else{
            System.out.println("Sorry..!  You are not eligible");
        }
    }
}