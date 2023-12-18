package mseva;

public class BladderCancer implements Disease {
    @Override
    public String getName() {
        return "Bladder Cancer (BC)";
    }

    @Override
    public String getSymptoms() {
        return "Stomach ache, vomiting, low eye sight, skin allergy, low bp";
    }
}