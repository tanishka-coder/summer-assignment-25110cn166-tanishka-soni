import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("Java Quiz");

        // Question 1
        System.out.println("\n1. Java is?");
        System.out.println("1. Programming Language");
        System.out.println("2. Browser");
        System.out.println("3. Database");
        System.out.println("4. Operating System");

        ans = sc.nextInt();
        if (ans == 1)
            score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. void");

        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 3
        System.out.println("\n3. Java was developed by?");
        System.out.println("1. Microsoft");
        System.out.println("2. Apple");
        System.out.println("3. Sun Microsystems");
        System.out.println("4. Google");

        ans = sc.nextInt();
        if (ans == 3)
            score++;

        System.out.println("\nYour Score: " + score + "/3");
    }
}
