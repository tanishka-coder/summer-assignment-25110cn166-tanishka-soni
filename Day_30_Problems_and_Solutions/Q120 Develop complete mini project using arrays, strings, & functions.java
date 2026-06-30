import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < n; i++) {

            System.out.println("Employee " + (i + 1));
            System.out.println("Name   : " + name[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println();
        }
    }
}
