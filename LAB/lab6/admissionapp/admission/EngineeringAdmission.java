package admission;

public class EngineeringAdmission implements AdmissionEligibility {
    @Override
    public boolean isAdmissible(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks) {
        return (mathsMarks >= 90 && physicsMarks >= 95 && chemistryMarks >= 70 && englishMarks >= 80 &&
                calculateTotalPercentage(mathsMarks, physicsMarks, chemistryMarks, englishMarks) >= 80);
    }

    private double calculateTotalPercentage(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks) {
        return (mathsMarks + physicsMarks + chemistryMarks + englishMarks) / 4.0;
    }
}

