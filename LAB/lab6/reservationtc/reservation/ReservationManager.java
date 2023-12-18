package reservation;

public class ReservationManager implements ReservationCost {
    @Override
    public double totalFare(Passenger[] passengers) {
        double totalFare = 0;

        for (Passenger passenger : passengers) {
            double fare = calculateFare(passenger);
            totalFare += fare;
        }

        return totalFare;
    }

    private double calculateFare(Passenger passenger) {
        switch (passenger.getType().toLowerCase()) {
            case "children":
                return 0; // Children travel for free
            case "students":
                return 0.7 * passenger.getActualFare(); // 30% discount for students
            case "seniorcitizens":
                return 0.5 * passenger.getActualFare(); // 50% discount for senior citizens
            case "citizens":
                return passenger.getActualFare(); // No discount for citizens
            default:
                System.out.println("Invalid passenger type: " + passenger.getType());
                return 0;
        }
    }
}
