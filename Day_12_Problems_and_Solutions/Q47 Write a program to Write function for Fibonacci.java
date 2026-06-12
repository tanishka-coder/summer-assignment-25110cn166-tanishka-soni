import java.util.Scanner;

class Q47Fibonacci {
    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive number of terms.");
            } else {
                System.out.print("Fibonacci series: ");
                printFibonacci(n);
            }
        }
        sc.close();
    }
}
