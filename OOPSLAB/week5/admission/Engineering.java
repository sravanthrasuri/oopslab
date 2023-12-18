package admission;
public class Engineering implements EligibilityCheck{
    public boolean CheckEligibility(int Maths, int Physics, int Chemistry, int English) {
        int totalMarks = Maths + Physics + Chemistry + English;
        double percentage = totalMarks / 4.0;

        return (Maths >= 90) && (Physics >= 95) && (Chemistry >= 70) && (English >= 80) && (percentage >= 80);
    }
}