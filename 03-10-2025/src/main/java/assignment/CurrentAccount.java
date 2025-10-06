package assignment;

public class CurrentAccount extends Account{
    private double creditLimit;

    public CurrentAccount(double balance, double creditLimit) {
        super(balance);
        if(creditLimit<0) throw new IllegalArgumentException(("Credit limit cannot be negative"));
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <=0) throw new IllegalArgumentException(("Withdraw Amount should not be negative"));
        if(balance + creditLimit <= amount) throw new IllegalArgumentException(("Exceeded credit limit for Current Account"));
        balance-=amount;
    }
    @Override
    public void deposit(double amount) {
        if(amount <=0) throw new IllegalArgumentException(("Deposit Amount should not be negative"));
        balance+=amount;
    }
}
