import java.util.Scanner;

class Q38ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
