package com.zeta.predconssupl.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainAccountSupplier {
    public static void main(String[] args) {
        Supplier<String> accountNumberSupplier = ()->"AC" + new Random().nextInt(100000);
        Supplier<Double> balanceSupplier = ()->new Random().nextDouble(100000.00);

        BankAccount acc1 = new BankAccount(accountNumberSupplier.get(),balanceSupplier.get());
        BankAccount acc2 = new BankAccount(accountNumberSupplier.get(),balanceSupplier.get());

        System.out.println("New Account Created");
        System.out.println(acc1);
        System.out.println(acc2);




        //collections -> collects all stream elements into a list
        System.out.println("Below multiple accounts creation using supplier");
        List<BankAccount> accountList;
        accountList = Stream.generate(()-> new BankAccount(accountNumberSupplier.get(),balanceSupplier.get())).limit(5).collect(Collectors.toList());
        accountList.forEach(System.out::println);
    }
}
