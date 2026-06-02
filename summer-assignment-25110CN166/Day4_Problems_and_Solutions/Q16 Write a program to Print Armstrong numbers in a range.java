import java.util.Scanner;

class Q16ArmstrongInRange {
    static int pow(int base, int exp) {
        int r = 1;
        while (exp-- > 0) r *= base;
        return r;
    }

    static boolean isArmstrong(int n) {
        int temp = n, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }
        if (n == 0) digits = 1;
        int sum = 0; temp = n;
        while (temp > 0) {
            sum += pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(0, a); i <= b; i++) if (isArmstrong(i)) sb.append(i).append(" ");
        System.out.println(sb.toString().trim());
    }
}
