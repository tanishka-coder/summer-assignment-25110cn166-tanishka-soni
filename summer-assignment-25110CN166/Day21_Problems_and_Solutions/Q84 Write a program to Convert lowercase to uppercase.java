import java.util.Scanner;

class Q84LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    chars[i] = (char) (chars[i] - 32);
                }
            }
            System.out.println("Uppercase string: " + new String(chars));
        }
        sc.close();
    }
}
