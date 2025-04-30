package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void isEven() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String userName = Cli.getUserName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int randNum = random.nextInt(100);
            System.out.println("Question: " + randNum);

            System.out.print("Your answer: ");
            String answer = scan.nextLine();
            String iSeven = randNum % 2 == 0 ? "yes" : "no";

            if (answer.equals(iSeven)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName);
    }
}
