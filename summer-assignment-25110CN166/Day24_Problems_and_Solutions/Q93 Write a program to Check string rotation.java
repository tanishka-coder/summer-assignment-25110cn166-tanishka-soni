import java.util.Scanner;

class Q93CheckStringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter rotated string: ");
        String str2 = sc.nextLine();
        
        if (str1.length() == str2.length() && str1.length() > 0) {
            String concat = str1 + str1;
            if (concat.contains(str2)) {
                System.out.println("The second string is a rotation of the first.");
            } else {
                System.out.println("The second string is not a rotation of the first.");
            }
        } else {
            System.out.println("The second string is not a rotation of the first.");
        }
        sc.close();
    }
}
