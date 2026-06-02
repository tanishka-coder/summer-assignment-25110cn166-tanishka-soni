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
                // Print ascending numbers
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                // Print descending numbers
                for (int l = i - 1; l >= 1; l--) {
                    System.out.print(l);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
