import bank.*;

import java.util.Scanner;

public class BankManager implements BankInterface {
    private String username;
    private String password;
    private double balance; 

    public BankManager(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
    }

    @Override
    public void credentialsCheck(String inputUsername, String inputPassword) {
        if (!username.equals(inputUsername) || !password.equals(inputPassword)) {
            System.out.println("Username and/or password mismatch. Please try again.");
        }
    }

    @Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited successfully. Current balance: " + balance);
    }

    @Override
    public void debit(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Debit amount exceeds available balance.");
        }
        balance -= amount;
        System.out.println("Amount debited successfully. Current balance: " + balance);
    }

    @Override
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    @Override
    public void exit() {
        System.out.println("Exiting Bank Management System. Thank you!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManager bankManager = new BankManager("john_doe", "password123", 1000);

        int choice;
        do {
            System.out.println("\nBank Management System Menu:");
            System.out.println("1. Login");
            System.out.println("2. Credit");
            System.out.println("3. Debit");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String enteredUsername = scanner.next();
                    System.out.print("Enter password: ");
                    String enteredPassword = scanner.next();
                    bankManager.credentialsCheck(enteredUsername, enteredPassword);
                    break;
                case 2:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    bankManager.credit(creditAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    try {
                        bankManager.debit(debitAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    bankManager.displayBalance();
                    break;
                case 5:
                    bankManager.exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}


