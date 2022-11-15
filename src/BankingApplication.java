import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        String customerName;
        String customerID;

        char userIdea = '\0';
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your User Name : ");
        customerName = input.nextLine();
        System.out.print("Enter Your ID- : ");
        customerID = input.nextLine();

        System.out.println("\n-------------------------------------------");
        System.out.println("Welcome "+ customerName+ "\n");

        System.out.println("A: For Customer Service Section ");
        System.out.println("B: For Loan Section ");
        System.out.print("\n Enter Your Choice : ");
        userIdea = input.next().charAt(0);
        System.out.println("\n");


        switch (userIdea) {
            case 'A':
                Bank bank = new Bank();
                bank.welcomePage();
                break;
            case 'B':
                LoanSection loansection = new LoanSection();
                loansection.loanSectionPage();
                break;
            default:
                System.out.println("Please Press A OR B to continue");
        }

    }
}
