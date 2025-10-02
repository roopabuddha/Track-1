package com.zeta.staticmethod.logging;

public class MainTransaction {
    public static void main(String[] args) {
        Transaction deposit = (amount) -> {
            System.out.println("Deposit " + amount + "\n");
            Transaction.log("Deposit of " + amount + " is completed");
        };

        Transaction withdraw = (amount) -> {
            System.out.println("Withdraw " + amount + "\n");
            Transaction.log("Withdraw of " + amount + " is completed");
        };

        deposit.execute(2000);
        withdraw.execute(1000);
    }
}
