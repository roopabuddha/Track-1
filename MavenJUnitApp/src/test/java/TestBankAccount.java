import com.zeta.test.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {
    BankAccount bankAccount;
    @BeforeEach
    void setUp() {
         bankAccount = new BankAccount("123","Savings",5000.00);
        System.out.println("Setup: Calculator instance created");
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(5500, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.withdraw(500);
        assertEquals(4500, bankAccount.getBalance());
    }

    @Test
    void testDepositException() {
        //we used lambda here to call deposit function from BankAccount class to check whether IllegalArgumentException is occuring or not passes if its true.
        Exception exception =  assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100.00));
        assertEquals("Amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawException() {
       Exception exception = assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-100.00));
       assertEquals("Amount must be positive", exception.getMessage());
    }

}
