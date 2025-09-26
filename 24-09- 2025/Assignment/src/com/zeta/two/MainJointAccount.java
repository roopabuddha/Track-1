package com.zeta.two;

public class MainJointAccount {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000.00);

        Queue queue = new Queue();

        Customer1 fedrick = new Customer1("Fedrick", sharedAccount, queue);
        Customer2 nesha = new Customer2("Nesha", sharedAccount, queue);

        fedrick.setWithdrawalAmount(100);
        nesha.setDepositAmount(150);
    }
}
