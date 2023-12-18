import reservation.Passenger;
import reservation.ReservationCost;
import reservation.ReservationManager;

public class ReservationApp {
    public static void main(String[] args) {
        Passenger[] passengers = {
                new Passenger("children", 100),
                new Passenger("students", 200),
                new Passenger("seniorcitizens", 150),
                new Passenger("citizens", 300)
        };

        ReservationCost reservationManager = new ReservationManager();
        double totalFare = reservationManager.totalFare(passengers);

        System.out.println("Total Fare for all passengers: $" + totalFare);
    }
}

