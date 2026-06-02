import java.util.Scanner;

class Q50SumAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 0) {
                int[] arr = new int[n];
                int sum = 0;
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    sum += arr[i];
                }
                double avg = (double) sum / n;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + avg);
            }
        }
        sc.close();
    }
}
