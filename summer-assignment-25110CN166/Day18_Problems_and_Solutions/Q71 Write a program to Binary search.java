import java.util.Scanner;

class Q71BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " sorted elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter element to search: ");
            int target = sc.nextInt();
            int left = 0, right = n - 1;
            boolean found = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    System.out.println("Element found at index: " + mid);
                    found = true;
                    break;
                }
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (!found) {
                System.out.println("Element not found.");
            }
        }
        sc.close();
    }
}
