import java.util.*;

class Dog {
    String name, breed, color, type;
    double height;

    Dog(String name, String breed, String color, String type, double height) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.type = type;
        this.height = height;
    }

    String getBreed() {
        return breed;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    String getType() {
        return type;
    }

    double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("snoopy", "pomerian", "white", "guard", 1);
        Dog rocky = new Dog("rocky", "lab", "brown", "sniffer", 3);
        Dog snowy = new Dog("snowy", "g.shepherd", "black", "shepherd", 4);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter breed, type, color, and height of the dog you want:");
        String breed = s.next();
        String type = s.next();
        String color = s.next();
        double height = s.nextDouble();

        Dog[] dogs = { snoopy, rocky, snowy };

        // Define a small epsilon value for double comparisons
        double epsilon = 0.0001;

        for (Dog dog : dogs) {
            if (dog.getBreed().equalsIgnoreCase(breed) && dog.getType().equalsIgnoreCase(type)
                    && Math.abs(dog.getHeight() - height) < epsilon
                    && dog.getColor().equalsIgnoreCase(color)) {
                System.out.println("As per your input, you can take the " + dog.getName());
                break;
            }
        }
    }
}
