import java.util.Scanner;

class Q22BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        System.out.println(Integer.parseInt(b, 2));
    }
}
