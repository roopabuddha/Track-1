package com.mycom.withoutdry;

public class AccountServiceWithoutDry {
    private static final double MIN_AMOUNT = 1.00;
    private String sender = "Khithija", recipient;
    private double balance;

    public AccountServiceWithoutDry(double balance) {
        this.balance = balance;
    }

    public String transferFunds(String recipient,double amount) {
     if (amount <= 0) {
         return "Amount must be greater than 0.";
     }
     if (amount < MIN_AMOUNT) {
         return "Amount must be greater than 0.";
     }
     if (this.balance < amount) {
         return "Error: Insufficient funds.";
     }
     this.balance -= amount;
     return "Funds Transferred successfully";
    }

    public String processPayment(String merchantId, double amount) {
        if  (amount <= 0) {
            return "Amount must be greater than 0.";
        }
        if (amount < MIN_AMOUNT) {
            return "Amount must be greater than 0.";
        }
        if (this.balance < amount) {
            return "Error: Insufficient funds.";
        }
        this.balance -= amount;
        return "Funds Transferred successfully";
    }
}
