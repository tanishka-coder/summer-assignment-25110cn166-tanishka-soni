import java.util.Scanner;

class Q8CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println((original == rev * sign) ? "Palindrome" : "Not Palindrome");
    }
}
