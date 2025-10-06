package com.mycom.withkiss;

public class BankAccountWithFee {
    private static final double MONTHLY_FEE = 5.00;
    private static final double MIN_BALANCE_WAIVER = 500.00;

    private double balance;

    public BankAccountWithFee(double balance) {
        this.balance = balance;
    }

    public void applyMonthlyFee() {
        double fee;
        if (this.balance < MIN_BALANCE_WAIVER) {
            fee = MONTHLY_FEE;
        } else {
            fee = 0.00;
        }
            this.balance -= fee;
            System.out.println("Fee applied: " + fee);
        }

    public double getBalance() {
        return balance;
    }
}
