import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr1) {
            set.add(x);
        }

        for (int x : arr2) {
            set.add(x);
        }

        System.out.println(set);
    }
}
