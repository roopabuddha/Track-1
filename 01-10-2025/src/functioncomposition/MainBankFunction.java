package functioncomposition;

import java.util.function.Consumer;
import java.util.function.Function;

public class MainBankFunction {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("AC1001",10000);
        BankAccount acc2 = new BankAccount("AC1002",10000);

        Function<BankAccount, BankAccount> deductFee = (amount )-> {
            amount.setBalance(amount.getBalance() - 50);
            return amount;
        };

        Function<BankAccount, BankAccount> applyInterest = (amount )-> {
            amount.setBalance(amount.getBalance() + (amount.getBalance() * 0.02));
            return amount;
        };

        Function<BankAccount, BankAccount> addReward = (amount )-> {
            amount.setBalance(amount.getBalance() * 0.01);
            return amount;
        };


        Function<BankAccount,BankAccount> pipelineAndThen = deductFee.andThen(applyInterest).andThen(addReward);
        BankAccount bankAccount1 = pipelineAndThen.apply(acc1);
        System.out.println(bankAccount1);

        Function<BankAccount,BankAccount> pipelineCompose = addReward.compose(applyInterest);

        BankAccount bankAccount2 = pipelineCompose.apply(acc1);
        System.out.println(bankAccount2);

        Consumer<BankAccount> notify = (bankAccount) ->
            System.out.println(bankAccount);
        notify.accept(acc1);
        notify.accept(acc2);
    }
}
