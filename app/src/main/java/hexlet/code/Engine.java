package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3; // Общее количество раундов для всех игр

    public static void runGame(String greeting, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(greeting);  // Выводим приветствие для игры

        if (questionsAndAnswers.length == 0 || questionsAndAnswers.length != ROUNDS) {
            System.err.println("Error: Invalid questionsAndAnswers data.");
            scanner.close();
            return;
        }

        String userName = Cli.getUserName(); // Получаем имя пользователя

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
                return; // Прерываем игру при ошибке
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
