import java.util.Scanner;

// Question No. Q24: Find x^n without pow()
class Q24PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        long res = 1;
        for (int i = 0; i < n; i++) res *= x;
        System.out.println(res);
    }
}
