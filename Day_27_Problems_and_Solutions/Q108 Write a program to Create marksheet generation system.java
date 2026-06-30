import java.util.Scanner;

public class MarksheetGeneration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n----- Marksheet -----");
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
    }
}
