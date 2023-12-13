package week2;
import java.util.*;
public class Mail {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        final double p1=99.90;
        final double p2=20.20;
        final double p3=6.87;
        final double p4=45.50;
        final double p5=40.49;
        double total=0.0;
        while (true){
            System.out.print("Enter product ID (1-5) or -1 to exit: ");
            int productId = sc.nextInt();
            if (productId == -1) {
                break;
            }
            System.out.print("Enter quantity sold: ");
            int quantitySold = sc.nextInt();
            double retailValue = 0.0;
            switch (productId) {
                case 1:
                    retailValue = p1 * quantitySold;
                    break;
                case 2:
                    retailValue = p2 * quantitySold;
                    break;
                case 3:
                    retailValue = p3 * quantitySold;
                    break;
                case 4:
                    retailValue = p4 * quantitySold;
                    break;
                case 5:
                    retailValue = p5 * quantitySold;
                    break;
                default:
                    System.out.println("Invalid product ID. Please enter a number between 1 and 5.");
                    continue;
            }
            total += retailValue;
        }
        System.out.println("Total Retail Value of All Products Sold: Rs. " + total);
        sc.close();
    }
}
