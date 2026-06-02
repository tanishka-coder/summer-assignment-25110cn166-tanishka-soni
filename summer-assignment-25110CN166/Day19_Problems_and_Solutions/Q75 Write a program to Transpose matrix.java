import java.util.Scanner;

class Q75TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        if (sc.hasNextInt()) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] a = new int[rows][cols];
            
            System.out.println("Enter matrix:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    a[i][j] = sc.nextInt();
                    
            System.out.println("Transpose of matrix:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
