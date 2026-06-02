import java.util.Scanner;

class Q7ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if (n == 0) { System.out.println(0); return; }
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        System.out.println(product);
    }
}
