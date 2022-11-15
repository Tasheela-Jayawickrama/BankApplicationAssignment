import java.util.Scanner;

public class Bank {
    private double currentBalance;
    private double interestAmount;

    public double depositMoney(double amount) {
        if (amount != 0) {
            currentBalance -= interestAmount;
            currentBalance += amount;
        }
        return amount;
    }

    public void withdrawMoney(double amount) {
        if (amount != 0) {
            currentBalance -= amount;
        }
    }

    public double accountBalance() {
        double accountInterestRate = 0.35;
        interestAmount = (currentBalance * accountInterestRate) / 100;
        currentBalance += interestAmount;
        return currentBalance;
    }

    public void welcomePage() {
        char chooseOption = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("     ----------------------------------- ");
        System.out.println("    | A : Check your account balance    |");
        System.out.println("    | B : Deposit Money                 |");
        System.out.println("    | C : Withdraw Money                |");
        System.out.println("    | D : Exit the banking Application  |");
        System.out.println("     ----------------------------------- ");


        do {
            System.out.print("\n Your Option : ");
            chooseOption = input.next().charAt(0);

            switch (chooseOption) {
                case 'A':
                    System.out.println("Your Current Account Balance : " + accountBalance());
                    break;
                case 'B':
                    System.out.print("Enter The Amount You Want to Deposit : ");
                    int depositAmount = input.nextInt();
                    depositMoney(depositAmount);
                    break;
                case 'C':
                    System.out.print("Enter The Amount You Want to WithDraw : ");
                    int withdrawAmount = input.nextInt();
                    withdrawMoney(withdrawAmount);
                    break;
                case 'D':
                    System.out.println("Exiting the Application");
                    break;
                default:
                    System.out.println("Invalid Option Try Again");
            }

        } while (chooseOption != 'D');
        System.out.println("Thank You For Banking With Us");
    }
}
