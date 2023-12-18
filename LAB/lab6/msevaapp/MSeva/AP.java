package MSeva;

public class AP implements Disease {
    @Override
    public String getDiseaseName() {
        return "Acute Pancreatitis (AP)";
    }

    @Override
    public String[] getSymptoms() {
        return new String[]{"Stomach ache", "vomiting", "low eye sight", "Muscle ache", "fever"};
    }
}

