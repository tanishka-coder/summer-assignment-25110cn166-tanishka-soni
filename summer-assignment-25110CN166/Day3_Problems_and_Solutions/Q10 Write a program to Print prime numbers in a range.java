import java.util.Scanner;

class Q10PrimesInRange {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(2, a); i <= b; i++) if (isPrime(i)) sb.append(i).append(" ");
        System.out.println(sb.toString().trim());
    }
}
