package week1;
import java.util.*;
public class DogTest {
    public static void main(String args[]){
         Dog d1=new Dog("snoopy","pomerian","white",1,"guard");
        Dog d2=new Dog("rocky","lab","brown",3,"sniffer");
        Dog d3=new Dog("snowy","german shepherd","black",4,"shepherd");
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter breed, type, color, and height of the dog you want:");
        String breed = s.next();
        String type = s.next();
        String color = s.next();
        double height = s.nextDouble();

        Dog[] dogs = { d1,d2,d3 };

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
