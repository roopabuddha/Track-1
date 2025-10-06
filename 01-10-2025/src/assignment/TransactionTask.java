package assignment;


import static assignment.TransactionSimulator.random;

class TransactionTask implements Runnable {
    private final BankAccount[] accounts;

    public TransactionTask(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
        int action = random.nextInt(3);  // Randomly choose deposit, withdraw, or transfer
        int accountIndex = random.nextInt(accounts.length);
        BankAccount account = accounts[accountIndex];

        switch (action) {
            case 0:  // Deposit
                double depositAmount = random.nextInt(500) + 50;  // Random deposit amount between 50 and 500
                account.deposit(depositAmount);
                break;
            case 1:  // Withdraw
                double withdrawAmount = random.nextInt(500) + 50;  // Random withdraw amount between 50 and 500
                try {
                    account.withdraw(withdrawAmount);
                } catch (InsufficientFundsException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case 2:  // Transfer
                int targetAccountIndex = random.nextInt(accounts.length);
                while (targetAccountIndex == accountIndex) {
                    targetAccountIndex = random.nextInt(accounts.length);  // Prevent transferring to the same account
                }
                double transferAmount = random.nextInt(500) + 50;
                account.transfer(accounts[targetAccountIndex], transferAmount);
                break;
        }
    }
}

