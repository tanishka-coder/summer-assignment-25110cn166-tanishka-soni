import java.util.Scanner;

class Q90FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            int[] freq = new int[256];
            boolean found = false;
            for (int i = 0; i < str.length(); i++) {
                if (freq[str.charAt(i)] == 1) {
                    System.out.println("First repeating character: " + str.charAt(i));
                    found = true;
                    break;
                } else {
                    freq[str.charAt(i)]++;
                }
            }
            if (!found) {
                System.out.println("No repeating character found.");
            }
        }
        sc.close();
    }
}
