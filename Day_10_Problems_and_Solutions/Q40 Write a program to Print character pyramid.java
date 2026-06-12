import java.util.Scanner;

class Q40CharacterPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            char ch = 'A';
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print characters
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(ch);
                }
                ch++; // Move to the next character for the next row
                System.out.println();
            }
        }
        sc.close();
    }
}
