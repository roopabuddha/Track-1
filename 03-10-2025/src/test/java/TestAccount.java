import assignment.CurrentAccount;
import assignment.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {
    Logger logger= Logger.getLogger(TestAccount.class.getName());
    SavingsAccount account;
    CurrentAccount currentAccount;

    @BeforeEach
    public void setup(){
        account=new SavingsAccount(2000,2.3f);
        currentAccount=new CurrentAccount(3000,1000);
    }
    //------------Test for SavingsAccount-------------------
    //Test to check the withdraw method
    @Test
    public void TestWithdrawSavingAccount(){
        account.withdraw(300);
        assertEquals(1700,account.getBalance());
    }

    //Test to withdraw more amount than balance
    @Test
    public void TestExceedingLimitThrowsExceptionSavingAccount(){
        assertThrows(IllegalArgumentException.class,()->account.withdraw(3000));
    }

    //Test to check whether balance is updated after applying the interest rate
    @Test
    public void TestIntersetRate(){
        account.applyInterestRate();
        assertEquals(2045.9999990463257,account.getBalance());
    }

    @Test
    public void TestDepositSavingsAccount(){
        account.deposit(1000);
        assertEquals(3000,account.getBalance());
    }
    @Test
    public void TestWithdrawNegativeAmountSavingsAccount(){
        assertThrows(IllegalArgumentException.class,()->account.withdraw(-1));
    }

    //---------------CurrentAccount------------------
    @Test
    public void TestWithdrawCurrentAccount(){
        currentAccount.withdraw(1000);
        assertEquals(2000,account.getBalance());
    }
    @Test
    public void TestWithdrawMoreAmountCurrentAccount(){
        assertThrows(IllegalArgumentException.class,()->{
            currentAccount.withdraw(5000);
        });
    }

    //Account Transfer
    @Test
    public void TestTransfer(){
        currentAccount.transfer(1000,(SavingsAccount)account);
        assertEquals(2000,currentAccount.getBalance());
        assertEquals(3000,account.getBalance());
    }
    //Test if account is given as null
    @Test
    public void TestTransferThrowsException(){
        assertThrows(IllegalArgumentException.class,()->{
            currentAccount.transfer(1000,null);
        });
    }
}
 