package com.zeta;

public class BankingOperation {
    public static void main(String[] args) {
        double balance = 100000;
        double depositAmount = 25000;
        double withdrawAmount = 4000;
        double interestRate = 0.04;

        balance +=  depositAmount;
        balance -= withdrawAmount;

        double interest = balance*interestRate;
        boolean eligibility = balance > 5000 && interest > 200;
        System.out.println("updated balance:" + balance);
        System.out.println("Interest Earned:" + interest);
        System.out.println("loan Eligibility:" + eligibility);

    }
}
