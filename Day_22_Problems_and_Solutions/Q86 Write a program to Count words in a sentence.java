import java.util.Scanner;

public class Main {

    static int countWordsInSentence(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(countWordsInSentence(str));
    }
}
