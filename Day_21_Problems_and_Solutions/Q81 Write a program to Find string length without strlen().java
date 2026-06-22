import java.util.Scanner;

public class Main {

    static int stringLengthWithoutStrlen(String str) {
        int count = 0;

        for(char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(stringLengthWithoutStrlen(str));
    }
}
