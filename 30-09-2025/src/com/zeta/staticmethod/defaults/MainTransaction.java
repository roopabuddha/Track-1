package com.zeta.staticmethod.defaults;

import java.util.concurrent.atomic.AtomicReference;

public class MainTransaction {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Rupa",6000);
        AtomicReference<String> transactionState = new AtomicReference<>("");
        AtomicReference<Double> amount1 = new AtomicReference<>((double) 0);
        Transaction deposit = amount -> {
            if (Transaction.validateAmount(amount)) {
                bankAccount.deposit(amount);
                transactionState.set("Successful");
                amount1.set(amount);
            } else {
                transactionState.set("UnSuccessful");
                System.out.println("Insufficient funds");
                amount1.set(amount);
            }

        };

        Transaction withdraw = amount -> {
            if (Transaction.validateAmount(amount)) {
                bankAccount.withdraw(amount);
                transactionState.set("Successful");
                amount1.set(amount);
            } else {
                transactionState.set("UnSuccessful");
                System.out.println("Insufficient funds");
                amount1.set(amount);
            }

        };
        deposit.execute(1000);
        deposit.printReceipt("Deposit",amount1.get(),transactionState);

        deposit.execute(-20);
        deposit.printReceipt("Withdraw",amount1.get(),transactionState);

    }
}
