package com.mycom.withoutkiss;

public class BankAccountWithFee {
    private double balance;
    private FeeStrategy feeStrategy;

    public BankAccountWithFee(double initialBalance) {
        this.balance = initialBalance;
    }

    public void applyMonthlyFee() {
        double fee = feeStrategy.calculateFee(this.balance);
        this.balance -= fee;
        System.out.println("Fee applied: " + fee);

    }


}
