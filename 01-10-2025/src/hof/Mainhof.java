package hof;


import java.util.function.Function;
import java.util.logging.Logger;

public class Mainhof {
        public static BankAccount updateAccount(
                BankAccount account, Function<BankAccount,BankAccount> operation) {
            return operation.apply(account);
        }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ZE3001",10000);
        Function<BankAccount,BankAccount> deductFee = a-> {
            a.setBalance(a.getBalance()-50);
            return a;
        };

        Function<BankAccount,BankAccount> applyInterest = a-> {
            a.setBalance(a.getBalance()+ (a.getBalance()*1.01));
            return a;
        };

        Function<BankAccount,BankAccount> addReward = a-> {
            a.setBalance(a.getBalance()+ (a.getBalance()*0.01));
            return a;
        };

        updateAccount(acc,deductFee);
        updateAccount(acc,applyInterest);
        updateAccount(acc,addReward);





    }
}
