import java.util.Scanner;

class Q52CountEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int evenCount = 0, oddCount = 0;
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Even elements count: " + evenCount);
            System.out.println("Odd elements count: " + oddCount);
        }
        sc.close();
    }
}
