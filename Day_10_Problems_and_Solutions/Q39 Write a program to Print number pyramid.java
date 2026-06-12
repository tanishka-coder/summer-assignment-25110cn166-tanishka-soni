import java.util.Scanner;

class Q39NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print numbers
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
