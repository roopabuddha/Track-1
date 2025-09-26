package com.zeta;

public class BankingLoops {
    public static void main(String[] args) {
        double balance = 10000;
        double emi = 2000;
        String[] Months = {"January", "February", "March", "April", "May","June"};

        for (int month = 1; month <= 5; month++) {
            balance -= emi;
            System.out.printf("Received EMI for Month %s | Balance after Deducting EMI: %s%n", Months[month-1],balance);
        }

        double depositAmount = 1000;
        double targetAmount = 20000;
        int months = 0;

        while (balance < targetAmount) {
            balance += depositAmount;
            months++;
        }

        System.out.printf("Target Reached in %s Months with Balance :%s%n",months,balance);

        int transactionCount = 0;
        do {
            System.out.println("Processing Transaction #" + (transactionCount+1));
            transactionCount++;
        } while (transactionCount < 3);
    }
}
