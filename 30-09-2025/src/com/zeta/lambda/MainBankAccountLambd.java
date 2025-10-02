package com.zeta.lambda;

public class MainBankAccountLambd {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rupa",5000);

        //Deposit transaction using lambda (Runnable)
        //An interface reference should be given for lambda expression
        Runnable deposit = () -> account.deposit(100);
        Runnable withdraw = () -> account.withdraw(100);
        Runnable withdraw2 = () -> account.withdraw(100);


        deposit.run();
        withdraw.run();
        withdraw2.run();

    }
}
