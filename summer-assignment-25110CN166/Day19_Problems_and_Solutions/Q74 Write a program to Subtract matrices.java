import java.util.Scanner;

class Q74SubtractMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        if (sc.hasNextInt()) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] a = new int[rows][cols];
            int[][] b = new int[rows][cols];
            int[][] diff = new int[rows][cols];
            
            System.out.println("Enter first matrix:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    a[i][j] = sc.nextInt();
                    
            System.out.println("Enter second matrix:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    b[i][j] = sc.nextInt();
                    
            System.out.println("Difference of matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    diff[i][j] = a[i][j] - b[i][j];
                    System.out.print(diff[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
