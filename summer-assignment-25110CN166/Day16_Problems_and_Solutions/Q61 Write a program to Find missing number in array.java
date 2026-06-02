import java.util.Scanner;

class Q61FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (array will have N-1 elements): ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Enter " + (n - 1) + " elements (from 1 to " + n + "):");
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int i = 0; i < n - 1; i++) {
                actualSum += sc.nextInt();
            }
            System.out.println("Missing number is: " + (expectedSum - actualSum));
        }
        sc.close();
    }
}
