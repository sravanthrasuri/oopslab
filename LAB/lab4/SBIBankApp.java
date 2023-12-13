import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 1000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be greater than 1000.0");
            System.exit(1);
        }
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

class Customer {
    private String branchName;
    private int accountNumber;
    private String accountName;
    private Account account;

    public Customer(String branchName, int accountNumber, String accountName, double initialBalance) {
        this.branchName = branchName;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.account = new Account(initialBalance);
    }

    public void exit() {
        System.out.println("Exiting from the account: " + this.accountName);
    }

    public String getBranchName() {
        return branchName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public Account getAccount() {
        return account;
    }
}

public class SBIBankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize customer accounts for Basar and Nizambad branches
        Customer customer1 = new Customer("Basar", 1001, "Customer1", 2000.0);
        Customer customer2 = new Customer("Basar", 1002, "Customer2", 1500.0);
        Customer customer3 = new Customer("Basar", 1003, "Customer3", 3000.0);
        Customer customer4 = new Customer("Basar", 1004, "Customer4", 1200.0);
        Customer customer5 = new Customer("Basar", 1005, "Customer5", 2500.0);

        Customer customer6 = new Customer("Nizambad", 2001, "Customer6", 1800.0);
        Customer customer7 = new Customer("Nizambad", 2002, "Customer7", 2200.0);
        Customer customer8 = new Customer("Nizambad", 2003, "Customer8", 2700.0);
        Customer customer9 = new Customer("Nizambad", 2004, "Customer9", 1600.0);
        Customer customer10 = new Customer("Nizambad", 2005, "Customer10", 3500.0);

        // Login
        while (true) {
            System.out.print("Enter Branch Name: ");
            String branchName = scanner.nextLine();
            System.out.print("Enter Account Number: ");
            int accountNumber = Integer.parseInt(scanner.nextLine());
   //   Customer cust[]={customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10};
         //   Customer customer = findCustomer(branchName, accountNumber,cust);  //(or)
         
         Customer customer = findCustomer(branchName, accountNumber,customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10);

            if (customer != null) {
                System.out.println("Welcome, " + customer.getAccountName() + "!");
                boolean exitApplication = false;
                while (!exitApplication) {
                    displayMenu();
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount to credit: ");
                            double creditAmount = Double.parseDouble(scanner.nextLine());
                            customer.getAccount().credit(creditAmount);
                            break;
                        case 2:
                            System.out.print("Enter the amount to debit: ");
                            double debitAmount = Double.parseDouble(scanner.nextLine());
                            customer.getAccount().debit(debitAmount);
                            break;
                        case 3:
                            double balance = customer.getAccount().getBalance();
                            System.out.println("Current Balance: " + balance);
                            break;
                        case 4:
                            customer.exit();
                            exitApplication = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

                System.out.print("Exit from the application? (Yes/No): ");
                String exitChoice = scanner.nextLine();
                if (exitChoice.equalsIgnoreCase("Yes")) {
                    break;
                }
            } else {
                System.out.println("Authorization failed. Please try again.");
            }
        }

        scanner.close();
    }

   // private static Customer findCustomer(String branchName, int accountNumber, Customer cust[]) {
  // for (Customer customer : cust) { // or
   
   private static Customer findCustomer(String branchName, int accountNumber, Customer... customers) {
        for (Customer customer : customers) {
            if (customer.getBranchName().equalsIgnoreCase(branchName) && customer.getAccountNumber() == accountNumber) {
                return customer;
            }
        }
        return null;
    }

    private static void displayMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Credit");
        System.out.println("2. Debit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}
 
