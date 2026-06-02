import java.util.Scanner;

class Q56FindDuplicates {
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
            System.out.print("Duplicate elements: ");
            boolean hasDuplicates = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        hasDuplicates = true;
                        break;
                    }
                }
            }
            if (!hasDuplicates) {
                System.out.println("None");
            } else {
                System.out.println();
            }
        }
        sc.close();
    }
}
