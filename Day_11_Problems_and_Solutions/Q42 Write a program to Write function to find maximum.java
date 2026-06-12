import java.util.Scanner;

class Q42FindMaximum {
    // Function to find the maximum of two numbers
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                int max = findMax(num1, num2);
                System.out.println("Maximum is: " + max);
            }
        }
        sc.close();
    }
}
