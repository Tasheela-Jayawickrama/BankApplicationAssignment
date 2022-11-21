import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {
    Bank bank = new Bank();

    @Test
    void integrationTest() {
        bank.depositMoney(150000);
        bank.withdrawMoney(50000);
        assertEquals(50000, bank.currentBalance);

        System.out.println("\n All Tests Passed");
    }
}

