import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Berth {
    private String coach;
    private int berthNumber;

    public Berth(String coach, int berthNumber) {
        this.coach = coach;
        this.berthNumber = berthNumber;
    }

    public String getCoach() {
        return coach;
    }

    public int getBerthNumber() {
        return berthNumber;
    }

    @Override
    public String toString() {
        return coach + "-" + berthNumber;
    }
}

class TrainReservation {
    private static final int AC_CAPACITY = 70;
    private static final int SLEEPER_CAPACITY = 70;

    private List<Berth> acBerthsB1 = new ArrayList<>();
    private List<Berth> acBerthsB2 = new ArrayList<>();
    private List<Berth> sleeperBerthsS1 = new ArrayList<>();
    private List<Berth> sleeperBerthsS2 = new ArrayList<>();

    public TrainReservation() {
        initializeBerths(acBerthsB1, "B1", AC_CAPACITY);
        initializeBerths(acBerthsB2, "B2", AC_CAPACITY);
        initializeBerths(sleeperBerthsS1, "S1", SLEEPER_CAPACITY);
        initializeBerths(sleeperBerthsS2, "S2", SLEEPER_CAPACITY);
    }

    private void initializeBerths(List<Berth> berths, String coach, int capacity) {
        for (int i = 1; i <= capacity; i++) {
            berths.add(new Berth(coach, i));
        }
    }

    public List<Berth> bookBerths(int numBerths, String coachType) throws ReservationException {
        if (numBerths > 6) {
            throw new ReservationException("You may be an Agent: Maximum 6 berths allowed.");
        }

        List<Berth> selectedBerths;
        if (coachType.equalsIgnoreCase("A/C")) {
            selectedBerths = bookACBerths(numBerths);
        } else if (coachType.equalsIgnoreCase("sleeper")) {
            selectedBerths = bookSleeperBerths(numBerths);
        } else {
            throw new ReservationException("Invalid coach type. Choose A/C or Sleeper.");
        }

        return selectedBerths;
    }

    private List<Berth> bookACBerths(int numBerths) {
        List<Berth> availableBerths = new ArrayList<>();
        availableBerths.addAll(acBerthsB1);
        availableBerths.addAll(acBerthsB2);

        return bookBerths(availableBerths, numBerths);
    }

    private List<Berth> bookSleeperBerths(int numBerths) {
        List<Berth> availableBerths = new ArrayList<>();
        availableBerths.addAll(sleeperBerthsS1);
        availableBerths.addAll(sleeperBerthsS2);

        return bookBerths(availableBerths, numBerths);
    }

    private List<Berth> bookBerths(List<Berth> availableBerths, int numBerths) throws ReservationException {
        if (availableBerths.size() < numBerths) {
            throw new ReservationException("Insufficient berths available.");
        }

        Collections.shuffle(availableBerths); // Randomly allocate berths
        List<Berth> selectedBerths = availableBerths.subList(0, numBerths);

        availableBerths.removeAll(selectedBerths); // Remove booked berths from available list

        return selectedBerths;
    }
}

class ReservationException extends Exception {
    public ReservationException(String message) {
        super(message);
    }
}

public class TrainReservationApp {
    public static void main(String[] args) {
        try {
            TrainReservation trainReservation = new TrainReservation();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of berths (maximum 6): ");
            int numBerths = scanner.nextInt();

            System.out.print("Enter the coach type (A/C or Sleeper): ");
            String coachType = scanner.next();

            List<Berth> bookedBerths = trainReservation.bookBerths(numBerths, coachType);

            System.out.println("Confirmed Berths: " + bookedBerths);

        } catch (ReservationException e) {
            System.out.println("Reservation Error: " + e.getMessage());
        }
    }
}

