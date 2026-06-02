import java.util.Scanner;

class Q54FrequencyOfElement {
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
            System.out.print("Enter element to find frequency: ");
            int target = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    count++;
                }
            }
            System.out.println("Frequency of " + target + " is: " + count);
        }
        sc.close();
    }
}
