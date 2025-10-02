package Assignment.q1;

public class BankAccount {
    private String accountHolder;
    public float balance;


    public BankAccount(String accountHolder, float balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getaccountHolder() {
        return accountHolder;
    }

    public void setaccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public float getbalance() {
        return balance;
    }

    public void setbalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
