import java.util.Scanner;

class Q78CheckSymmetricMatrix {
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
                    
            boolean isSymmetric = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
            }
            if (isSymmetric) {
                System.out.println("Matrix is symmetric.");
            } else {
                System.out.println("Matrix is not symmetric.");
            }
        }
        sc.close();
    }
}
