import java.util.Scanner;

class Q79RowWiseSum {
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
                    
            for (int i = 0; i < rows; i++) {
                int sum = 0;
                for (int j = 0; j < cols; j++) {
                    sum += a[i][j];
                }
                System.out.println("Sum of row " + (i + 1) + " = " + sum);
            }
        }
        sc.close();
    }
}
