package week2;
import java.util.*;
public class UniqueNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("Enter 5 numbers between 10 and 100 (inclusive):");
        for (int i = 0; i < 5; i++){
            int number;
            do {
                System.out.print("Enter number " + (i + 1) + ": ");
                number = scanner.nextInt();
                if (number < 10 || number > 100) {
                    System.out.println("Invalid input! Please enter a number between 10 and 100.");
                }
            } while (number < 10 || number > 100);
            if (uniqueNumbers.add(number)) {
                System.out.println("New unique value: " + number);
            } else {
                System.out.println("Duplicate value! Not displayed.");
            }
            System.out.println("Current set of unique values: " + uniqueNumbers);
        }
        scanner.close();
    }
}

