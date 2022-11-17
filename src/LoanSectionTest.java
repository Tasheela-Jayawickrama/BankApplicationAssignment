import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanSectionTest {
    LoanSection loanSection = new LoanSection();

    @Test
    void testLoanMonthlyRepayment(){
        assertEquals(31944.444444444445,loanSection.calculateMonthlyPayment(36,1000000,5));
    }
}
