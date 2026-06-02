import java.util.Scanner;

class Q19PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) if (n % i == 0) sb.append(i).append(" ");
        System.out.println(sb.toString().trim());
    }
}
