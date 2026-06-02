import java.util.Scanner;

class Q86CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine().trim();
            if (str.isEmpty()) {
                System.out.println("Number of words: 0");
            } else {
                int count = 1;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ' ' && i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                        count++;
                    }
                }
                System.out.println("Number of words: " + count);
            }
        }
        sc.close();
    }
}
