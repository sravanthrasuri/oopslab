import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;

public class DisplaySubjectsApp {
    public static void main(String[] args) {
        // Display subjects for each department
        CSE cseDept = new CSE();
        ECE eceDept = new ECE();
        ME meDept = new ME();
        CE ceDept = new CE();

        System.out.println("========================================");
        cseDept.displaySubjects();
        System.out.println("========================================");
        eceDept.displaySubjects();
        System.out.println("========================================");
        meDept.displaySubjects();
        System.out.println("========================================");
        ceDept.displaySubjects();
        System.out.println("========================================");
    }
}

