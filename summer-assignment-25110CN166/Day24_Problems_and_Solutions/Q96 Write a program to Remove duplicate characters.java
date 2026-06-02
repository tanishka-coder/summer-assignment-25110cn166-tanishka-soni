import java.util.Scanner;

class Q96RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            StringBuilder result = new StringBuilder();
            boolean[] visited = new boolean[256];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!visited[ch]) {
                    result.append(ch);
                    visited[ch] = true;
                }
            }
            System.out.println("String without duplicates: " + result.toString());
        }
        sc.close();
    }
}
