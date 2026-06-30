import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("\n----- Student Record -----");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
    }
}
