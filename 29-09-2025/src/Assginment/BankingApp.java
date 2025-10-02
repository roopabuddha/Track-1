package Assginment;

import java.util.*;
import java.util.stream.Collectors;

public class BankingApp {
    private static List<BankAccount> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Banking Application ---");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Update Account");
            System.out.println("5. Delete Account");
            System.out.println("6. High Balance Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: createAccount(); break;
                case 2: displayAllAccounts(); break;
                case 3: searchAccount(); break;
                case 4: updateAccount(); break;
                case 5: deleteAccount(); break;
                case 6: highBalanceAccounts(); break;
                case 7: System.out.println("Exiting application. Goodbye!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
    }

    // 1. Create Account
    private static void createAccount() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        scanner.nextLine();

        boolean exists = accounts.stream().anyMatch(acc -> acc.getAccountNumber() == accNum);
        if (exists) {
            System.out.println("Account number already exists!");
            return;
        }

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        accounts.add(new BankAccount(accNum, name, balance));
        System.out.println("Account created successfully.");
    }

    // 2. Display All Accounts
    private static void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            accounts.forEach(System.out::println);
        }
    }

    // 3. Search Account
    private static void searchAccount() {
        System.out.print("Enter account number to search: ");
        int accNum = scanner.nextInt();

        accounts.stream()
                .filter(acc -> acc.getAccountNumber() == accNum)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Account not found.")
                );
    }

    // 4. Update Account (Deposit / Withdraw)
    private static void updateAccount() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();

        Optional<BankAccount> optionalAccount = accounts.stream()
                .filter(acc -> acc.getAccountNumber() == accNum)
                .findFirst();

        if (!optionalAccount.isPresent()) {
            System.out.println("Account not found.");
            return;
        }

        BankAccount account = optionalAccount.get();

        System.out.println("1. Deposit\n2. Withdraw");
        int option = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (option == 1) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Amount deposited successfully.");
        } else if (option == 2) {
            if (amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid option.");
        }
    }

    // 5. Delete Account
    private static void deleteAccount() {
        System.out.print("Enter account number to delete: ");
        int accNum = scanner.nextInt();

        boolean removed = accounts.removeIf(acc -> acc.getAccountNumber() == accNum);

        if (removed) {
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // 6. High Balance Accounts
    private static void highBalanceAccounts() {
        System.out.print("Enter balance threshold: ");
        double threshold = scanner.nextDouble();

        List<BankAccount> filtered = accounts.stream()
                .filter(acc -> acc.getBalance() > threshold)
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("No accounts found with balance above $" + threshold);
        } else {
            System.out.println("Accounts with balance above $" + threshold + ":");
            filtered.forEach(System.out::println);
        }
    }
}
