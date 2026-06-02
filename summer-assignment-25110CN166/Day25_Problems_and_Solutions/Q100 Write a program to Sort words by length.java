import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Q100SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        if (sc.hasNextLine()) {
            String sentence = sc.nextLine();
            String[] words = sentence.split("\\s+");
            
            Arrays.sort(words, new Comparator<String>() {
                public int compare(String a, String b) {
                    return Integer.compare(a.length(), b.length());
                }
            });
            
            System.out.println("Words sorted by length:");
            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
