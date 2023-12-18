package week3;
import java.util.*;

class Vehicle {
    String company;
    String model;
    double mileage;
    double fuelCapacity;
    double displacement;

    // Other common properties and methods can be added here

    public Vehicle(String company, String model, double mileage, double fuelCapacity, double displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    String userReviews;

    public TwoWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, String userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    boolean airBags;
    boolean powerSteering;
    boolean rainSensingWiper;

    public FourWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                       boolean airConditioner, boolean airBags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airBags = airBags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }
}

public class VehicleComparison {
    public static void main(String[] args) {
        List<Vehicle> repository = createVehicleRepository();

        displayAvailableVehicles(repository);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vehicles you want to compare:");
        int numberOfVehiclesToCompare = scanner.nextInt();

        List<Vehicle> selectedVehicles = selectVehiclesToCompare(repository, numberOfVehiclesToCompare);

        if (selectedVehicles.size() > 0) {
            compareAndDisplayBestModel(selectedVehicles);
        } else {
            System.out.println("No vehicles selected for comparison.");
        }
    }

    private static List<Vehicle> createVehicleRepository() {
        List<Vehicle> repository = new ArrayList<>();

        repository.add(new TwoWheeler("Honda", "CBR250R", 30.0, 15.0, 250.0, "Disc", "Disc", "Tubeless", "LED", "Positive"));
        repository.add(new TwoWheeler("Yamaha", "YZF R15", 35.0, 12.0, 150.0, "Disc", "Disc", "Tubeless", "Halogen", "Excellent"));
        repository.add(new FourWheeler("Toyota", "Camry", 20.0, 60.0, 2500.0, true, true, true, true));
        repository.add(new FourWheeler("Honda", "Civic", 18.0, 55.0, 2000.0, true, true, true, true));

        return repository;
    }

    private static void displayAvailableVehicles(List<Vehicle> vehicles) {
        System.out.println("Available Vehicles for Comparison:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i).company + " " + vehicles.get(i).model);
        }
    }

    private static List<Vehicle> selectVehiclesToCompare(List<Vehicle> vehicles, int numberOfVehicles) {
        List<Vehicle> selectedVehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("Enter the number for vehicle " + (i + 1) + " to compare:");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= vehicles.size()) {
                selectedVehicles.add(vehicles.get(choice - 1));
            } else {
                System.out.println("Invalid choice. Please enter a valid number.");
                i--; // Decrement i to re-enter the choice for the current vehicle
            }
        }

        return selectedVehicles;
    }

    private static void compareAndDisplayBestModel(List<Vehicle> vehicles) {
        Vehicle bestModel = vehicles.get(0);

        for (int i = 1; i < vehicles.size(); i++) {
            if (vehicles.get(i).mileage > bestModel.mileage) {
                bestModel = vehicles.get(i);
            }
        }

        System.out.println("The best model to buy is:");
        System.out.println(bestModel.company + " " + bestModel.model);
    }
}
