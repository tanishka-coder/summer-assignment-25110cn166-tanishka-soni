import java.util.Scanner;

class Q51LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 0) {
                int[] arr = new int[n];
                System.out.println("Enter " + n + " elements:");
                arr[0] = sc.nextInt();
                int min = arr[0];
                int max = arr[0];
                for (int i = 1; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] < min) min = arr[i];
                    if (arr[i] > max) max = arr[i];
                }
                System.out.println("Smallest element: " + min);
                System.out.println("Largest element: " + max);
            }
        }
        sc.close();
    }
}
