import java.util.Scanner;

class Q35RepeatedCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) ('A' + i - 1));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
