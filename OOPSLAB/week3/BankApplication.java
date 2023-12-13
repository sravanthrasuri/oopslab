package week3;
import java.util.*;
class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 1000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be greater than 1000.0");
        }
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited successfully. New balance: " + balance);
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance. Transaction canceled.");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully. New balance: " + balance);
        }
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void exit() {
        System.out.println("Exiting the transaction.");
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SBI Bank");
        System.out.print("Enter your Branch Name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter your Account Number: ");
        String accountNumber = scanner.nextLine();

        // Assuming 5 customers in each branch
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(1500.0); // Initial balance set to 1500.0 for demonstration
        }

        boolean exitApplication = false;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Get Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    accounts[0].credit(creditAmount); // Assuming the first account for demonstration
                    break;
                case 2:
                    System.out.print("Enter the amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    accounts[0].debit(debitAmount); // Assuming the first account for demonstration
                    break;
                case 3:
                    accounts[0].getBalance(); // Assuming the first account for demonstration
                    break;
                case 4:
                    accounts[0].exit(); // Assuming the first account for demonstration
                    System.out.print("Exit application? (Yes/No): ");
                    String exitChoice = scanner.next();
                    if (exitChoice.equalsIgnoreCase("Yes")) {
                        exitApplication = true;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

        } while (!exitApplication);

        scanner.close();
    }
}