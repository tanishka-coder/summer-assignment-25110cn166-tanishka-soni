import java.util.Scanner;

class Q94CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.isEmpty()) {
                System.out.println("Compressed string: ");
                return;
            }
            StringBuilder compressed = new StringBuilder();
            int count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    compressed.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
            compressed.append(str.charAt(str.length() - 1)).append(count);
            System.out.println("Compressed string: " + compressed.toString());
        }
        sc.close();
    }
}
