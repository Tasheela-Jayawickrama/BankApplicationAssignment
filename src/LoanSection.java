import java.util.Scanner;

public class LoanSection {
    Scanner input = new Scanner(System.in);

    public void loanSectionPage() {
        char userInput = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("A : Loan Calculator");
        System.out.println("E : Exit the banking Application");
        do {
            System.out.print("\n Enter Your Choice : ");
            userInput = input.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch (userInput) {
                case 'A':
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


    public void showRatesAndTimePeriods() {
        System.out.println(" ------------------------ Loan Calculator --------------------------   ");
        System.out.println("\n");
        System.out.println(" -------------------------------------------------------------------   ");
        System.out.println("|       Years       |       Months      |       Interest Rate       |");
        System.out.println("|         3         |         36        |           5%              |");
        System.out.println("|         5         |         60        |           7.5%            |");
        System.out.println("|         7         |         84        |           10.5%           |");
        System.out.println("|            More Than 7 Years          |           12%             |");
        System.out.println(" -------------------------------------------------------------------   ");
        System.out.println("\n");
    }

    public double calculateMonthlyPayment(int timePeriod, double loanAmount, double interestRate) {
        double interest = (loanAmount * timePeriod * (interestRate / 12)) / 100;
        double fullPayment = loanAmount + interest;
        double monthlyPayment = fullPayment / timePeriod;
        System.out.println("The monthly payment is : Rs." + Math.round(monthlyPayment));
        return monthlyPayment;
    }

    public void loanCalculator() {
        showRatesAndTimePeriods();
        System.out.print("Enter the loan amount you wish : Rs.");
        double loanAmount = input.nextDouble();
        System.out.print("Enter the Time period (In Months) : ");
        int timePeriod = input.nextInt();
        if (timePeriod < 36) {
            System.out.println("You Are Not Eligible For A Loan");
        }
        if (timePeriod == 36) {
            calculateMonthlyPayment(timePeriod, loanAmount, 5);
        }
        if (timePeriod == 60) {
            calculateMonthlyPayment(timePeriod, loanAmount, 7.5);
        }
        if (timePeriod == 84) {
            calculateMonthlyPayment(timePeriod, loanAmount, 10.5);
        }
        if (timePeriod > 84) {
            calculateMonthlyPayment(timePeriod, loanAmount, 12);
        }
    }
}
