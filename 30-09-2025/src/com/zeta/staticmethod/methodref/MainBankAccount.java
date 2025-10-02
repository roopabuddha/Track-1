package com.zeta.staticmethod.methodref;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Rupa",10000);


        // :: is method reference
        Runnable greet = BankAccount::bankGreeting;
        greet.run();

        Runnable depositAction = bankAccount::deposit;
        depositAction.run();

        Runnable withdrawAction = bankAccount::withdraw;
        withdrawAction.run();

        Printer printName = bankAccount::printAccountHolder;
        printName.print();

        AccountCreator creator = BankAccount::new;
        BankAccount virat = creator.createAccount("Virat",10000);
        virat.deposit();
        virat.withdraw();


    }
}