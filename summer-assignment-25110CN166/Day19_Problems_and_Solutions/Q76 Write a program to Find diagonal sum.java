import java.util.Scanner;

class Q76DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            
            System.out.println("Enter matrix:");
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
                    
            int primarySum = 0, secondarySum = 0;
            for (int i = 0; i < n; i++) {
                primarySum += a[i][i];
                secondarySum += a[i][n - 1 - i];
            }
            System.out.println("Primary diagonal sum: " + primarySum);
            System.out.println("Secondary diagonal sum: " + secondarySum);
        }
        sc.close();
    }
}
