import java.util.Scanner;

class Q81StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            int length = 0;
            for (char c : str.toCharArray()) {
                length++;
            }
            System.out.println("Length of string: " + length);
        }
        sc.close();
    }
}
