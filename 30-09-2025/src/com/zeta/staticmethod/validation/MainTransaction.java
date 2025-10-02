package com.zeta.staticmethod.validation;

public class MainTransaction {
    public static void main(String[] args) {
        Transaction deposit = amount -> {
            if (Transaction.validateAmount(amount)) {
                System.out.println("Deposited " + amount);
            }  else {
                System.out.println("Invalid amount! Amount is -ve");
            }
        };

        deposit.execute(100);
        deposit.execute(-200);
    }
}
