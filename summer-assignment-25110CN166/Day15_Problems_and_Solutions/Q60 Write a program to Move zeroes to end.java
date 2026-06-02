import java.util.Scanner;

class Q60MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[index++] = arr[i];
                }
            }
            while (index < n) {
                arr[index++] = 0;
            }
            System.out.print("Array after moving zeroes to end: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
