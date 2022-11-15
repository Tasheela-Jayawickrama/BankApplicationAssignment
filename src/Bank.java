import java.util.Scanner;

public class Bank {
    private double currentBalance;

    public double depositMoney(double amount) {
        if (amount != 0) {
            currentBalance += amount;
        }
        return amount;
    }

    public double withdrawMoney(double amount) {
            if (amount < currentBalance) {
                currentBalance -= amount;
            }else {
                System.out.println(" You Don't have Sufficient Balance to Withdraw..\n Please Check Your Account Balance First");
            }
        return amount;
    }

    public double accountBalance() {
        double accountInterestRate = 0.35;
        double interestAmount = (currentBalance * accountInterestRate) / 100;
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
            chooseOption = input.next().toUpperCase().charAt(0);

            switch (chooseOption) {
                case 'A':
                    System.out.println("Your Current Account Balance : " + accountBalance());
                    break;
                case 'B':
                    System.out.print("Enter The Amount You Want to Deposit : ");
                    double depositAmount = input.nextDouble();
                    depositMoney(depositAmount);
                    break;
                case 'C':
                    System.out.print("Enter The Amount You Want to WithDraw : ");
                    double withdrawAmount = input.nextDouble();
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
