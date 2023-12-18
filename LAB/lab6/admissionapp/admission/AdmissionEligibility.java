package admission;

public interface AdmissionEligibility {
    boolean isAdmissible(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks);
}
