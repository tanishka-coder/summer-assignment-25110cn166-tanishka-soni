import java.util.Scanner;

class Q98CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (char c : str1.toCharArray()) freq1[c]++;
        for (char c : str2.toCharArray()) freq2[c]++;

        System.out.print("Common characters: ");
        for (int i = 0; i < 256; i++) {
            if (freq1[i] > 0 && freq2[i] > 0) {
                System.out.print((char) i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
