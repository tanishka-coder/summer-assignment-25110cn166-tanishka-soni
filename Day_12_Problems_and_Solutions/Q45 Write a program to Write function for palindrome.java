import java.util.Scanner;

class Q45Palindrome {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int temp = n;
        int reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return n == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Negative numbers are not considered palindromes.");
            } else if (isPalindrome(n)) {
                System.out.println(n + " is a palindrome number.");
            } else {
                System.out.println(n + " is not a palindrome number.");
            }
        }
        sc.close();
    }
}
