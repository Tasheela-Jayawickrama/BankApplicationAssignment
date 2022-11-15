import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getDepositMoney() {
        Bank bank = new Bank();
        assertEquals(1000, bank.depositMoney(1000));
    }

    @Test
    void withdrawMoney() {
        System.out.println("Hello");
    }

    @Test
    void accountBalance() {
    }

    @Test
    void welcomePage() {
    }
}