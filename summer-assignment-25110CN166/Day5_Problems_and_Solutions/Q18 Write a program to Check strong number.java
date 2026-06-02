import java.util.Scanner;

class Q18CheckStrongNumber {
    static int fact(int d) {
        int f = 1;
        for (int i = 2; i <= d; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        System.out.println(sum == n ? "Strong" : "Not Strong");
    }
}
