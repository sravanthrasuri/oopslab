import java.util.Scanner;
// ECommerceProductRecommendation
public class ecommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter product details
        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the company it belongs to: ");
        String company = scanner.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total cost for Amazon and Flipkart
        double amazonTotalCost = calculateAmazonTotalCost(productName, quantity);
        double flipkartTotalCost = calculateFlipkartTotalCost(productName, quantity);

        // Determine the cost-effective option
        String recommendation;
        if (amazonTotalCost < flipkartTotalCost) {
            recommendation = "Amazon";
        } else {
            recommendation = "Flipkart";
        }

        // Display the recommendation to the user
        System.out.println("Recommendation: It's cost-effective to buy from " + recommendation);

        scanner.close();
    }

    private static double calculateAmazonTotalCost(String productName, int quantity) {
        // You can define your pricing logic for Amazon here
        double pricePerUnit = 100.0; // Replace with actual price
        double amazonDiscount = 0.0;

        // Check if HDFC credit card holder
        boolean isHDFCCardHolder = checkHDFCCardHolder(); // Implement this method

        if (isHDFCCardHolder) {
            amazonDiscount = 0.10;
        }

        if (quantity > 50) {
            amazonDiscount += 0.15;
        }

        return pricePerUnit * quantity * (1 - amazonDiscount);
    }

    private static double calculateFlipkartTotalCost(String productName, int quantity) {
        // You can define your pricing logic for Flipkart here
        double pricePerUnit = 110.0; // Replace with actual price
        double flipkartDiscount = 0.0;

        // Check if RGUKT student
        boolean isRGUKTStudent = checkRGUKTStudent(); // Implement this method

        if (isRGUKTStudent) {
            flipkartDiscount = 0.30;
        }

        if (quantity > 30) {
            flipkartDiscount += 0.05;
        }

        return pricePerUnit * quantity * (1 - flipkartDiscount);
    }

    // Implement the checkHDFCCardHolder and checkRGUKTStudent methods as per your requirements
    private static boolean checkHDFCCardHolder() {
        // Add your logic to check if the user has an HDFC credit card
        return true; // Replace with actual logic
    }

    private static boolean checkRGUKTStudent() {
        // Add your logic to check if the user is an RGUKT student
        return false; // Replace with actual logic
    }
}

