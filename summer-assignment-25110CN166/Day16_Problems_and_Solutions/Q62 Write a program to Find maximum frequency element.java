import java.util.Scanner;

class Q62MaxFrequencyElement {
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
            int maxFreq = 0, mostFreqElement = -1;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > maxFreq) {
                    maxFreq = count;
                    mostFreqElement = arr[i];
                }
            }
            System.out.println("Maximum frequency element: " + mostFreqElement);
        }
        sc.close();
    }
}
