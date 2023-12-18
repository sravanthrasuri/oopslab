package bank;
public interface BankInterface {
    abstract void credentialsCheck(String username, String password);
    abstract void credit(double amount);
    abstract void debit(double amount) throws InsufficientBalanceException;
    abstract void displayBalance();
    abstract void exit();
}