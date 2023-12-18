package mseva;
public class PancreaticCancer implements Disease {
    @Override
    public String getName() {
        return "Pancreatic Cancer (PC)";
    }

    @Override
    public String getSymptoms() {
        return "Stomach ache, vomiting, low eye sight, fever, fatigue";
    }
}