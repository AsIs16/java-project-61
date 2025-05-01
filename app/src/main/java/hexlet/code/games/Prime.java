package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Prime {
    public static boolean isSimple(Integer number) {
        if (number < 2) {return false;}
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

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int numRan = random.nextInt(150);
            String question = numRan + "";
            String correctAnswer = isSimple(numRan) ? "yes" : "no";

            questionsAndAnswersPrime[i][0] = question;
            questionsAndAnswersPrime[i][1] = correctAnswer;
        }
        Engine.runGame(greetingPrime, questionsAndAnswersPrime);
    }

}
