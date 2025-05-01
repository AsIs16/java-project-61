package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.runGame;

public class Prime {
    private static final int MAX_NUMBER = 150;

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void playPrimeGame() {
        String greetingPrime = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswersPrime = new String[ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int numRan = random.nextInt(MAX_NUMBER);
            String question = numRan + "";
            String correctAnswer = isSimple(numRan) ? "yes" : "no";

            questionsAndAnswersPrime[i][0] = question;
            questionsAndAnswersPrime[i][1] = correctAnswer;
        }
        runGame(greetingPrime, questionsAndAnswersPrime);
    }

}
