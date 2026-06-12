import java.util.Scanner;

class Q41SumOfTwoNumbers {
    // Function to find the sum of two numbers
    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                int sum = findSum(num1, num2);
                System.out.println("Sum is: " + sum);
            }
        }
        sc.close();
    }
}
