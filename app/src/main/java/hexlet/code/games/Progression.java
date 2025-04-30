package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_START_VALUE = 1;
    private static final int MAX_START_VALUE = 20;
    private static final int MIN_DIFFERENCE = 1;
    private static final int MAX_DIFFERENCE = 5;

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static String[] generateProgression(int start, int difference, int length) {
        String[] progression = new String[length];
        for (int j = 0; j < length; j++) {
            progression[j] = String.valueOf(start + j * difference);
        }
        return progression;
    }

    public static void playProgressionGame() {
        String greetingProgression = "What number is missing in the progression?";
        String[][] questionsAndAnswersProgression = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = getRandomNumber(MIN_START_VALUE, MAX_START_VALUE);
            int difference = getRandomNumber(MIN_DIFFERENCE, MAX_DIFFERENCE);
            int length = getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int hiddenIndex = random.nextInt(length);

            String[] progression = generateProgression(start, difference, length);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            questionsAndAnswersProgression[i][0] = question;
            questionsAndAnswersProgression[i][1] = correctAnswer;

        }

        Engine.runGame(greetingProgression, questionsAndAnswersProgression);
    }
}
