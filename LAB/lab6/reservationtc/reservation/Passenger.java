package reservation;

public class Passenger {
    private String type;
    private double actualFare;

    public Passenger(String type, double actualFare) {
        this.type = type;
        this.actualFare = actualFare;
    }

    public double getActualFare() {
        return actualFare;
    }

    public String getType() {
        return type;
    }
}

