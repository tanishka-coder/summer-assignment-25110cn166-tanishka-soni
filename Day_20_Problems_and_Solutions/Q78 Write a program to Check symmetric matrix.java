public class Main {

    public static boolean isSymmetric(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        if(isSymmetric(arr, 3))
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}
