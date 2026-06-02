import java.util.Scanner;

class Q77MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for first matrix: ");
        if (sc.hasNextInt()) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int[][] a = new int[r1][c1];
            System.out.println("Enter first matrix:");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    a[i][j] = sc.nextInt();
                    
            System.out.print("Enter rows and columns for second matrix: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != r2) {
                System.out.println("Matrices cannot be multiplied.");
            } else {
                int[][] b = new int[r2][c2];
                System.out.println("Enter second matrix:");
                for (int i = 0; i < r2; i++)
                    for (int j = 0; j < c2; j++)
                        b[i][j] = sc.nextInt();
                        
                int[][] prod = new int[r1][c2];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < c1; k++) {
                            prod[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                System.out.println("Product matrix:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.print(prod[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
