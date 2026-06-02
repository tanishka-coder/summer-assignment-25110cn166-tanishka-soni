import java.util.Scanner;

class Q67IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        if (sc.hasNextInt()) {
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            System.out.println("Enter elements of first array:");
            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            System.out.println("Enter elements of second array:");
            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            System.out.print("Intersection of arrays: ");
            for (int i = 0; i < n1; i++) {
                boolean isDuplicate = false;
                for (int k = 0; k < i; k++) {
                    if (arr1[i] == arr1[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) continue;
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
