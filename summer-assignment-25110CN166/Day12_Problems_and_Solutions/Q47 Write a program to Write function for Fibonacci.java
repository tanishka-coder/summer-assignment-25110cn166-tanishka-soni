import java.util.Scanner;

class Q47FibonacciFunction {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.print("Fibonacci series: ");
            printFibonacci(n);
        }
        sc.close();
    }
}
