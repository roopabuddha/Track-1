package assignment;

public class SavingsAccount extends Account {
    private float interestRate;
    public SavingsAccount(double balance,float interestRate) {
        super(balance);
        if(interestRate <0)  throw new IllegalArgumentException("Interest rate cannot be negative");
        this.interestRate=interestRate;
    }
    @Override
    public void withdraw(double amount) {
        if(amount<0) throw new IllegalArgumentException("Amount cannot be negative");
        if(balance < amount) throw new IllegalArgumentException(("There is no enough balance"));
        balance-=amount;
    }
    @Override
    public void deposit(double amount) {
        if(amount<0) throw new IllegalArgumentException("Amount cannot be negative");
        balance+=amount;
    }
    public void applyInterestRate() {
        balance+=((balance*interestRate)/100);
    }
}
