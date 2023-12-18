import mseva.PancreaticCancer;
import mseva.AcutePancreatis;
import mseva.Appendicitis;
import mseva.Disease;
import mseva.BladderCancer;
import java.util.Scanner;

public class Mainmseva {
    public static void main(String[] args) {
        System.out.println("Welcome to M-Seva");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your symptoms (comma-separated): ");
        String userSymptoms = scanner.nextLine();

        // Create instances of diseases
        Disease[] diseases = {
                new AcutePancreatis(),
                new Appendicitis(),
                new BladderCancer(),
                new PancreaticCancer()
        };
        boolean found = false;
        for (Disease disease : diseases) {
            if (containsAllSymptoms(userSymptoms, disease.getSymptoms())) {
                System.out.println("You may have: " + disease.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching disease found.");
        }

        scanner.close();
    }

    private static boolean containsAllSymptoms(String userSymptoms, String diseaseSymptoms) {
        String[] userSymptomsArray = userSymptoms.split(", ");
        String[] diseaseSymptomsArray = diseaseSymptoms.split(", ");

        for (String symptom : diseaseSymptomsArray) {
            boolean containsSymptom = false;
            for (String userSymptom : userSymptomsArray) {
                if (userSymptom.equals(symptom)) {
                    containsSymptom = true;
                    break;
                }
            }

            if (!containsSymptom) {
                return false;
            }
        }

        return true;
    }
}
