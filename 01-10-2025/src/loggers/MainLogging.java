package loggers;

public class MainLogging {
    public static void main(String[] args) {
        new TransactionService().transfer("SB123","SB3212",1000);
    }
}
