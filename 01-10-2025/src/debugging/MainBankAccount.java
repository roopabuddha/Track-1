package debugging;


public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount hdfc = new BankAccount("ZE3001",5000.0);
        hdfc.deposit(null);
        hdfc.deposit(-1.00);
        hdfc.deposit(0.00);

    }
}
