import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();
    @Test
    void testDepositMoney(){
        assertEquals(1000, bank.depositMoney(1000));
    }

    @Test
    void testWithdrawMoney(){
        assertEquals(5000,bank.withdrawMoney(5000));
    }

    @Test
    void testAccountWithInterest(){
        assertEquals(100291.66666666667,bank.accountBalance(100000,3.5));
    }
}
