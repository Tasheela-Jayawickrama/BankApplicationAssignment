import java.util.Scanner;

public class LoanSection {
    Scanner input = new Scanner(System.in);
    int loanMonthInput;
    double loanAmountInput;
    double interestRate;
    double loanInterestAmount;
    double netLoanAmount;
    double capitalAmount;
    double monthlyPaymentAmount;

    public void loanSectionPage() {
        char userInput = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("A : Loan Calculator");
        System.out.println("E : Exit the banking Application");


        do {
            System.out.print("\n Enter Your Choice : ");
            userInput = input.next().charAt(0);
            System.out.println("\n");

            switch (userInput) {
                case 'A':
                    System.out.println("=================== Loan Calculator ===================");
                    loanCalculator();
                    break;
                case 'E':
                    System.out.println("=================== Exiting the Application ===================");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (userInput != 'E');
        System.out.println("Thank You For Banking With Us");
    }

    public void loanCalculator() {
        System.out.print("Enter the time period ( In Months )  : ");
        loanMonthInput = input.nextInt();
        if (loanMonthInput < 36){
            System.out.println("The Time Period Must Be Greater The 36 Months ");
        }
        if (loanMonthInput == 36) {
            interestRate = 5.0/12;
            getInterest();
        } if (loanMonthInput == 60){
            interestRate = 7.5/12;
            getInterest();
        } if (loanMonthInput == 84){
            interestRate = 10.0/12;
            getInterest();
        } if (loanMonthInput > 84){
            interestRate = 12.5/12;
            getInterest();
        }
    }

    public void getInterest(){
        System.out.print("Enter the amount of loans ( In Rupees ): ");
        loanAmountInput = input.nextDouble();
        loanInterestAmount = (loanAmountInput * interestRate * loanMonthInput ) / 100;
        netLoanAmount = loanAmountInput + loanInterestAmount;
        capitalAmount = loanAmountInput / loanMonthInput;
        monthlyPaymentAmount = netLoanAmount / loanMonthInput;
        System.out.println("Monthly Repayment Of the Loan is : " + monthlyPaymentAmount);
    }
}
