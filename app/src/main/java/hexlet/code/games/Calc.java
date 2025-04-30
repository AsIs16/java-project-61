package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int MAX_NUMBER = 50;

    public static String getRandomOperator() {
        Random random = new Random();
        int ranNum = random.nextInt(3);
        return switch (ranNum) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> throw new IllegalStateException("Unexpected value: " + ranNum);
        };
    }

    public static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    public static void playCalcGame() {
        String greeting = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNum1 = random.nextInt(MAX_NUMBER) + 1;
            int randNum2 = random.nextInt(MAX_NUMBER) + 1;

            String operator = getRandomOperator();
            String question = "Question: " + randNum1 + " " + operator + " " + randNum2;
            int correctAnswer = calculate(randNum1, randNum2, operator);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);

        }

        Engine.runGame(greeting, questionsAndAnswers);
    }
}