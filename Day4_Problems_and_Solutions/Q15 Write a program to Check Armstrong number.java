import java.util.Scanner;

class Q15CheckArmstrong {
    public static int pow(int base, int exp) {
        int r = 1;
        while (exp-- > 0) r *= base;
        return r;
    }

    public static boolean isArmstrong(int n) {
        int temp = Math.abs(n);
        int digits = 0;
        int t = temp;
        while (t > 0) { digits++; t /= 10; }
        if (temp == 0) digits = 1;
        int sum = 0;
        while (temp > 0) {
            sum += pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == Math.abs(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "Armstrong" : "Not Armstrong");
    }
}
