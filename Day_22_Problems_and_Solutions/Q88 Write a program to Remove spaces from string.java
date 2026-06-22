import java.util.Scanner;

public class Main {

    static String removeSpacesFromString(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(removeSpacesFromString(str));
    }
}
