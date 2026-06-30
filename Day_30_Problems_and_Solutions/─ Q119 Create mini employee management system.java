import java.util.Scanner;

public class Main {

    static void addStudent(String[] name, int[] marks, int n) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static void displayStudent(String[] name, int[] marks, int n) {

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < n; i++) {

            System.out.println("Name  : " + name[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] marks = new int[n];

        addStudent(name, marks, n);

        displayStudent(name, marks, n);
    }
}
