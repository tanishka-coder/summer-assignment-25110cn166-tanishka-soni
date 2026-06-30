import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java",
                "Python",
                "C++",
                "DBMS",
                "Operating System"
        };

        boolean[] issued = new boolean[5];

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < books.length; i++) {
                        if (issued[i])
                            System.out.println((i + 1) + ". " + books[i] + " (Issued)");
                        else
                            System.out.println((i + 1) + ". " + books[i] + " (Available)");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int issue = sc.nextInt();

                    if (!issued[issue - 1]) {
                        issued[issue - 1] = true;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("Book Already Issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number: ");
                    int ret = sc.nextInt();

                    if (issued[ret - 1]) {
                        issued[ret - 1] = false;
                        System.out.println("Book Returned Successfully.");
                    } else {
                        System.out.println("Book Already Available.");
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
