package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public static void playGcdGame() {
        String greetingGCD = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswersGCD = new String[Engine.ROUNDS][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            String question = num1 + " " + num2;
            int correctAnswer = getGCD(num1, num2);

            questionsAndAnswersGCD[i][0] = question;
            questionsAndAnswersGCD[i][1] = String.valueOf(correctAnswer);

        }

        Engine.runGame(greetingGCD, questionsAndAnswersGCD);
    }
}
