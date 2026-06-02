import java.util.Scanner;

class Q89FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            int[] freq = new int[256];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)]++;
            }
            boolean found = false;
            for (int i = 0; i < str.length(); i++) {
                if (freq[str.charAt(i)] == 1) {
                    System.out.println("First non-repeating character: " + str.charAt(i));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No non-repeating character found.");
            }
        }
        sc.close();
    }
}
