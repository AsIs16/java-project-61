package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void runGame(String greeting, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(greeting);

        if (questionsAndAnswers.length == 0 || questionsAndAnswers.length != ROUNDS) {
            System.err.println("Error: Invalid questionsAndAnswers data.");
            scanner.close();
            return;
        }

        String userName = Cli.getUserName();

        for (String[] questionAndAnswer : questionsAndAnswers) {
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + userName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
