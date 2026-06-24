import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        HashSet<Character> set = new HashSet<>();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}
