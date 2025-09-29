package com.zeta.lambda.functionalinterface;

public class MainTransaction {
    public static void main(String[] args) {
        Transaction deposit = amount -> System.out.println("Deposit " + amount);
        deposit.execute(1000);
    }
}
