import java.util.Scanner;

class Q41SumOfTwoNumbers {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Sum: " + sum(num1, num2));
        }
        sc.close();
    }
}
