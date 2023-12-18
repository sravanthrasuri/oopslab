import admission.AdmissionEligibility;
import admission.EngineeringAdmission;
import admission.*;

import java.util.ArrayList;
import java.util.List;

public class AdmissionApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 92, 96, 75, 85));
        students.add(new Student("Alice", 88, 98, 72, 88));
        students.add(new Student("Bob", 94, 90, 78, 82));

        AdmissionEligibility eligibilityChecker = new EngineeringAdmission();

        System.out.println("List of eligible students for Engineering Admission:");

        for (Student student : students) {
            if (eligibilityChecker.isAdmissible(student.getMathsMarks(), student.getPhysicsMarks(),
                    student.getChemistryMarks(), student.getEnglishMarks())) {
                System.out.println(student.getName());
            }
        }
    }
}

