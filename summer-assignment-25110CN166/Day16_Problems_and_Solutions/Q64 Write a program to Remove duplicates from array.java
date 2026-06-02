import java.util.Scanner;

class Q64RemoveDuplicates {
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
            int newSize = 0;
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < newSize; j++) {
                    if (arr[i] == temp[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[newSize++] = arr[i];
                }
            }
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < newSize; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
