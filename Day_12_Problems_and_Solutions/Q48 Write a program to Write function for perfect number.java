import java.util.Scanner;

class Q48PerfectNumber {
    // Function to check if a number is a perfect number
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1; // 1 is always a proper divisor
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (isPerfect(n)) {
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " is not a perfect number.");
            }
        }
        sc.close();
    }
}
