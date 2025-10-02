package debugging;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else if (amount == 0) {
            throw new IllegalArgumentException("Amount cannot be zero");
        } else if (amount==null){
            throw new NullPointerException("Amount cannot be null");
        } else {
            this.balance += amount;
        }
    }
}
