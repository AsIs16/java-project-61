package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    private static final int MAX_NUMBER = 100; // Максимальное число для генерации
    private static final int ROUNDS = Engine.ROUNDS;  // Используем количество раундов из Engine

    public static void playEvenGame() {
        String greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int randomNumber = random.nextInt(MAX_NUMBER);
            String question = String.valueOf(randomNumber);
            String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.runGame(greeting, questionsAndAnswers);
    }
}
