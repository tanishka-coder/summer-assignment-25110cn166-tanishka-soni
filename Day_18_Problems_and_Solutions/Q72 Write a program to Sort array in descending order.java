import java.util.*;

public class Main {
    public static void sortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        sortDescending(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
