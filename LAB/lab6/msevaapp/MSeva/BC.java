package MSeva;

public class BC implements Disease {
    @Override
    public String getDiseaseName() {
        return "Bladder Cancer (BC)";
    }

    @Override
    public String[] getSymptoms() {
        return new String[]{"Stomach ache", "vomiting", "low eye sight", "skin allergy", "low bp"};
    }
}

