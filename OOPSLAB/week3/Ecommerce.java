package week3;
import java.util.Scanner;

class Product {
    private String name;
    private String company;
    private int quantity;

    public Product(String name, String company, int quantity) {
        this.name = name;
        this.company = company;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getQuantity() {
        return quantity;
    }
}
class Amazon {
    private static final double HDFC_DISCOUNT = 0.10;
    private static final double AMOUNT_DISCOUNT_THRESHOLD = 50000;

    public static double calculateCost(Product product) {
        double totalCost = product.getQuantity() * 100; // Assuming each unit costs 100 for demonstration
        double discountedCost = totalCost;

        // Apply HDFC discount
        discountedCost -= totalCost * HDFC_DISCOUNT;

        // Apply amount discount if the total amount exceeds the threshold
        if (totalCost > AMOUNT_DISCOUNT_THRESHOLD) {
            discountedCost -= totalCost * 0.15;
        }

        return discountedCost;
    }
}
class Flipkart {
    private static final double RGUKT_STUDENT_DISCOUNT = 0.30;
    private static final double AMOUNT_DISCOUNT_THRESHOLD = 30000;

    public static double calculateCost(Product product, boolean isRGUKTStudent) {
        double totalCost = product.getQuantity() * 120; // Assuming each unit costs 120 for demonstration
        double discountedCost = totalCost;

        // Apply RGUKT student discount
        if (isRGUKTStudent) {
            discountedCost -= totalCost * RGUKT_STUDENT_DISCOUNT;
        }

        // Apply amount discount if the total amount exceeds the threshold
        if (totalCost > AMOUNT_DISCOUNT_THRESHOLD) {
            discountedCost -= totalCost * 0.05;
        }

        return discountedCost;
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get product details from the user
        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the company of the product: ");
        String company = scanner.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Create a Product object
        Product product = new Product(productName, company, quantity);

        // Check cost-effectiveness and suggest where to buy
        double amazonCost = Amazon.calculateCost(product);
        double flipkartCost = Flipkart.calculateCost(product, true); // Assume user is an RGUKT student for demonstration

        System.out.println("\nSuggestion:");
        if (amazonCost < flipkartCost) {
            System.out.println("Suggest to buy from Amazon. Estimated cost: " + amazonCost);
        } else {
            System.out.println("Suggest to buy from Flipkart. Estimated cost: " + flipkartCost);
        }

        scanner.close();
    }
}