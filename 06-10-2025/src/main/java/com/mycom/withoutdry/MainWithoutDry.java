package com.mycom.withoutdry;

public class MainWithoutDry {
    public static void main(String[] args) {
        AccountServiceWithoutDry accountServiceWithoutDry = new AccountServiceWithoutDry(50000.025f);
        String transferFundsMsg, processPaymentMsg = null;

        transferFundsMsg = accountServiceWithoutDry.transferFunds("Vikranth",15000.25f);
        processPaymentMsg = accountServiceWithoutDry.processPayment("Jio Mobile",362.15f);

        System.out.println(transferFundsMsg);
        System.out.println(processPaymentMsg);
    }
}
