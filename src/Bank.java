import java.util.Scanner;

public class Bank {
    double currentBalance;
    double accountInterestRate;

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

    public double accountBalance(double currentBalance,double accountInterestRate) {
        accountInterestRate = 3.5 / 12;
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
                    System.out.println("Your Current Account Balance : Rs." + Math.round(accountBalance(currentBalance,accountInterestRate)));
                    break;
                case 'B':
                    System.out.print("Enter The Amount You Want to Deposit : Rs.");
                    double depositAmount = input.nextDouble();
                    Math.round(depositMoney(depositAmount));
                    break;
                case 'C':
                    System.out.print("Enter The Amount You Want to WithDraw : Rs.");
                    double withdrawAmount = input.nextDouble();
                    Math.round(withdrawMoney(withdrawAmount));
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
