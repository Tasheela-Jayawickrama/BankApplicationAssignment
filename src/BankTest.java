import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void testDepositMoney() {
        Bank bank = new Bank();
        assertEquals(1000, bank.depositMoney(1000));
    }

    @Test
    void testWithdrawMoney() {
        Bank bank = new Bank();
        assertEquals(500, bank.withdrawMoney(500));
    }

}