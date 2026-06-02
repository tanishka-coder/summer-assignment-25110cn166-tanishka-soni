import java.util.Scanner;

class Q12LCM {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a == 0 || b == 0) { System.out.println(0); return; }
        long l = Math.abs(a / gcd(a, b) * b);
        System.out.println(l);
    }
}
