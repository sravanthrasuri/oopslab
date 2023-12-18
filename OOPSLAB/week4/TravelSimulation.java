package week4;
interface Fare {
    double getFare(double distance);
    String getAmenities();
}

class Bus implements Fare {
    private String type;

    public Bus(String type) {
        this.type = type;
    }

    @Override
    public double getFare(double distance) {
        // Assume a basic fare per kilometer for demonstration
        double basicFare = 10.0;
        
        // Additional fare based on the type of bus
        double additionalFare = 0.0;
        switch (type.toLowerCase()) {
            case "a/c":
                additionalFare = 5.0;
                break;
            case "non a/c":
                additionalFare = 3.0;
                break;
            case "sleeper":
                additionalFare = 8.0;
                break;
            // Add more cases for different types of buses
            default:
                break;
        }

        return basicFare * distance + additionalFare;
    }

    @Override
    public String getAmenities() {
        // Assume different amenities based on the type of bus
        switch (type.toLowerCase()) {
            case "a/c":
                return "Air Conditioning, Comfortable Seats";
            case "non a/c":
                return "Seating Arrangement, Basic Comfort";
            case "sleeper":
                return "Beds, Privacy Curtains";
            // Add more cases for different types of buses
            default:
                return "Basic Amenities";
        }
    }
}

class Train implements Fare {
    private String type;

    public Train(String type) {
        this.type = type;
    }

    @Override
    public double getFare(double distance) {
        // Assume a basic fare per kilometer for demonstration
        double basicFare = 8.0;

        // Additional fare based on the type of train
        double additionalFare = 0.0;
        switch (type.toLowerCase()) {
            case "general":
                additionalFare = 2.0;
                break;
            case "sleeper":
                additionalFare = 5.0;
                break;
            case "a/c":
                additionalFare = 10.0;
                break;
            // Add more cases for different types of trains
            default:
                break;
        }

        return basicFare * distance + additionalFare;
    }

    @Override
    public String getAmenities() {
        // Assume different amenities based on the type of train
        switch (type.toLowerCase()) {
            case "general":
                return "Basic Seating";
            case "sleeper":
                return "Sleeping Arrangements, Basic Facilities";
            case "a/c":
                return "Air Conditioning, Comfortable Seating";
            // Add more cases for different types of trains
            default:
                return "Basic Amenities";
        }
    }
}

class Flight implements Fare {
    private String classType;

    public Flight(String classType) {
        this.classType = classType;
    }

    @Override
    public double getFare(double distance) {
        // Assume a basic fare per kilometer for demonstration
        double basicFare = 15.0;

        // Additional fare based on the class of the flight
        double additionalFare = 0.0;
        switch (classType.toLowerCase()) {
            case "economy":
                additionalFare = 12.0;
                break;
            case "business":
                additionalFare = 25.0;
                break;
            // Add more cases for different classes of flights
            default:
                break;
        }

        return basicFare * distance + additionalFare;
    }

    @Override
    public String getAmenities() {
        // Assume different amenities based on the class of the flight
        switch (classType.toLowerCase()) {
            case "economy":
                return "Standard Seating, In-Flight Entertainment";
            case "business":
                return "Luxurious Seating, Gourmet Meals, Priority Services";
            // Add more cases for different classes of flights
            default:
                return "Basic Amenities";
        }
    }
}

public class TravelSimulation {
    public static void main(String[] args) {
        // Create instances of Bus, Train, and Flight
        Bus bus = new Bus("A/C");
        Train train = new Train("Sleeper");
        Flight flight = new Flight("Economy");

        // Simulate a travel distance
        double distance = 500.0; // Assume the distance in kilometers for demonstration

        // Display fare and amenities for each mode of transportation
        displayFareAndAmenities(bus, distance);
        displayFareAndAmenities(train, distance);
        displayFareAndAmenities(flight, distance);
    }

    private static void displayFareAndAmenities(Fare fareObject, double distance) {
        System.out.println("Details of the journey:");
        System.out.println("Fare: $" + fareObject.getFare(distance));
        System.out.println("Amenities: " + fareObject.getAmenities());
        System.out.println("---------------------");
    }
}
