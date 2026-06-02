import java.util.Scanner;

class Q55SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("Array should have at least two elements.");
            } else {
                int[] arr = new int[n];
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int largest = Integer.MIN_VALUE;
                int secondLargest = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    if (arr[i] > largest) {
                        secondLargest = largest;
                        largest = arr[i];
                    } else if (arr[i] > secondLargest && arr[i] != largest) {
                        secondLargest = arr[i];
                    }
                }
                if (secondLargest == Integer.MIN_VALUE) {
                    System.out.println("There is no second largest element.");
                } else {
                    System.out.println("Second largest element is: " + secondLargest);
                }
            }
        }
        sc.close();
    }
}
