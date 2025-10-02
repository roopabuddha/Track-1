package Assignment.q1;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.logging.Logger;

public class MenuDrivenBanking {
    //declaring logger to use logger statements instead of sout
    private static final Logger logger = Logger.getLogger(MenuDrivenBanking.class.getName());

    //HOF
    public static BankAccount updateAccount(
            BankAccount account, BiFunction<BankAccount, Float, BankAccount> operation, Float amount) {
        return operation.apply(account, amount);
    }

    public static void main(String[] args) {

        //To get random Account Number and balance
        Supplier<String> accountNumberSupplier = ()->"AC" + new Random().nextInt(100000);
        Supplier<Float> balanceSupplier = ()->new Random().nextFloat(100000.00f);
        AtomicReference<String> flag = new AtomicReference<>();



        BankAccount account1 = new BankAccount(accountNumberSupplier.get(),balanceSupplier.get());
        BankAccount account2 = new BankAccount(accountNumberSupplier.get(),balanceSupplier.get());


        //bifunction for taking 2 parameters as input (deposit)
        BiFunction<BankAccount, Float, BankAccount> deposit = (bankAccount, amount) -> {
            if (amount > 0) {
                flag.set("deposit");
                bankAccount.setbalance(bankAccount.getbalance() + amount);
            } else {
                flag.set(null);
                logger.warning("Amount must be positive");
            }
            return bankAccount;
        };

        //bifunction for withdraw
        BiFunction<BankAccount,Float,BankAccount> withdraw = (bankAccount, amount) -> {
            if (amount > 0) {
                flag.set("withdraw");
                bankAccount.setbalance(bankAccount.getbalance() - amount);
            } else {
                flag.set(null);
                logger.warning("Amount must be positive");
            }
            return bankAccount;
        };

        //function to calcuate interest
        Function<BankAccount,BankAccount> interestRate = bankAccount -> {
            bankAccount.setbalance(bankAccount.getbalance() + bankAccount.getbalance()*1.01f);
            return bankAccount;
        };

        //To get details of the account
        Predicate<BankAccount> getDetails = b -> b.getbalance() > 1000;
            Consumer<BankAccount> printAccount = b -> {
                logger.info("Account No " + b.getaccountHolder() + " Balance " + b.getbalance());
            };


        //To print the details of withdraw
        Consumer<BankAccount> printWithdraw = account -> {
            logger.info("Withdraw " + account.getbalance());
        };

        //to print details after deposit
        Consumer<BankAccount> printDeposit = account -> {
            logger.info("Deposit " + account.getbalance());
        };

        updateAccount(account1,deposit,1000.00f);

        printAccount.accept(account1);

        if (flag.get().equals("deposit")) {
            printDeposit.accept(account1);
        }

        updateAccount(account2,withdraw,1000.00f);
        if (flag.get().equals("withdraw")) {
            printWithdraw.accept(account2);
        }


    }
}
