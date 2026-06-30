import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Java Programming",
            "Python Basics",
            "Data Structures",
            "Operating System",
            "Computer Networks"
        };

        System.out.println("----- Library Books -----");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter book number to issue: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= books.length) {
            System.out.println("Book Issued Successfully!");
            System.out.println("Book Name: " + books[choice - 1]);
        } else {
            System.out.println("Invalid Book Number.");
        }
    }
}
