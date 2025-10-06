package assignment;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        if(balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    public void transfer(double amount,Account target){
        if(amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if(target == null) throw new IllegalArgumentException("Target cannot be null");
        this.withdraw(amount);
        target.deposit(amount);
    }

}
