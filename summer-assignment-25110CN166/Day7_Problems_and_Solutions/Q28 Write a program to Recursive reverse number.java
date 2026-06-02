import java.util.Scanner;

// Question No. Q28: Recursive reverse number
class Q28RecursiveReverseNumber {
    static int rev = 0;

    static void reverseNumber(int n) {
        if (n == 0) return;
        rev = rev * 10 + n % 10;
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumber(n);
        System.out.println(rev);
    }
}
