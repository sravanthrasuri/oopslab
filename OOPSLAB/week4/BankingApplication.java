import java.util.*;

interface RBI {
    void credit(double amount);

    void debit(double amount);

    void displayBalance();

   
    double personalLoanEligibility();

    double homeLoanEligibility();

    double vehicleLoanEligibility();
}


abstract class Bank implements RBI {
    double accountBalance;

    Bank(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    @Override
    public void credit(double amount) {
        accountBalance += amount;
        System.out.println("Credit Successful. Updated Balance: " + accountBalance);
    }

    @Override
    public void debit(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Debit Successful. Updated Balance: " + accountBalance);
        } else {
            System.out.println("Insufficient Funds. Debit Failed.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Balance: " + accountBalance);
    }
}


class SBI extends Bank {
    SBI(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double personalLoanEligibility() {
        return accountBalance * 0.2;
    }

    @Override
    public double homeLoanEligibility() {
        return accountBalance * 0.5;
    }

    @Override
    public double vehicleLoanEligibility() {
        return accountBalance * 0.3;
    }
}

class HDFC extends Bank {
    HDFC(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double personalLoanEligibility() {
        return accountBalance * 0.25;
    }

    @Override
    public double homeLoanEligibility() {
        return accountBalance * 0.6;
    }

    @Override
    public double vehicleLoanEligibility() {
        return accountBalance * 0.35;
    }
}

class DCB extends Bank {
    DCB(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double personalLoanEligibility() {
        return accountBalance * 0.15;
    }

    @Override
    public double homeLoanEligibility() {
        return accountBalance * 0.4;
    }

    @Override
    public double vehicleLoanEligibility() {
        return accountBalance * 0.25;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        SBI sbiAccount = new SBI(10000);
        HDFC hdfcAccount = new HDFC(15000);
        DCB dcbAccount = new DCB(20000);

    
        sbiAccount.credit(5000);
        sbiAccount.debit(2000);
        sbiAccount.displayBalance();

      
        System.out.println("SBI Personal Loan Eligibility: " + sbiAccount.personalLoanEligibility());
        System.out.println("HDFC Home Loan Eligibility: " + hdfcAccount.homeLoanEligibility());
        System.out.println("DCB Vehicle Loan Eligibility: " + dcbAccount.vehicleLoanEligibility());
    }
}

