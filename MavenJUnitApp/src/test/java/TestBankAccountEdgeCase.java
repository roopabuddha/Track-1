import com.zeta.test.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankAccountEdgeCase {
    @Test
    public void testWithdrawExactBalance() {
        BankAccount bankAccount = new BankAccount("123","savings",100.00);
        bankAccount.withdraw(100.00);
        assertEquals(0.0,bankAccount.getBalance());


    }
}
