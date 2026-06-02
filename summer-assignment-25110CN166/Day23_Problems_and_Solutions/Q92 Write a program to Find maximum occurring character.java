import java.util.Scanner;

class Q92MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            int[] freq = new int[256];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)]++;
            }
            int maxFreq = -1;
            char result = ' ';
            for (int i = 0; i < str.length(); i++) {
                if (maxFreq < freq[str.charAt(i)]) {
                    maxFreq = freq[str.charAt(i)];
                    result = str.charAt(i);
                }
            }
            System.out.println("Maximum occurring character: " + result);
        }
        sc.close();
    }
}
