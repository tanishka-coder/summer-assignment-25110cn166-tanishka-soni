import java.util.Scanner;

class Q44FindFactorial {
    // Function to find the factorial of a number
    public static long findFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = findFactorial(n);
                System.out.println("Factorial of " + n + " is: " + result);
            }
        }
        sc.close();
    }
}
