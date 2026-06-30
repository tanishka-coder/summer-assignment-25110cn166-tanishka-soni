import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        String[] numbers = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Contact Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            numbers[i] = sc.nextLine();
        }

        System.out.println("\n----- Contact List -----");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " : " + numbers[i]);
        }
    }
}
