import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        int choice;
        double amount;

        do {
            System.out.println("\n----- Bank Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit Successful.");
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }
}
