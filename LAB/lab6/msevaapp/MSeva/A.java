package MSeva;

public class A implements Disease {
    @Override
    public String getDiseaseName() {
        return "Appendicitis (A)";
    }

    @Override
    public String[] getSymptoms() {
        return new String[]{"Stomach ache", "vomiting", "low eye sight", "fever", "fatigue"};
    }
}

