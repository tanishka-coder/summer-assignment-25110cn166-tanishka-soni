import java.util.Scanner;

class Q46Armstrong {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;
        int sum = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return n == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Armstrong numbers are defined for non-negative integers.");
            } else if (isArmstrong(n)) {
                System.out.println(n + " is an Armstrong number.");
            } else {
                System.out.println(n + " is not an Armstrong number.");
            }
        }
        sc.close();
    }
}
