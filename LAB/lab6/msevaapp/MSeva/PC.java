package MSeva;

public class PC implements Disease {
    @Override
    public String getDiseaseName() {
        return "Pancreatic Cancer (PC)";
    }

    @Override
    public String[] getSymptoms() {
        return new String[]{"Stomach ache", "vomiting", "low eye sight", "fever", "fatigue"};
    }
}

