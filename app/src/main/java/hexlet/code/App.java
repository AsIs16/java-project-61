package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Engine.ROUNDS;

public class App {
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD"
                + "\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int userChoose = sc.nextInt();
        sc.nextLine();

        if (userChoose == 1) {
            Cli.getUserName();
        } else if (userChoose == 2) {
            Even.playEvenGame();
        } else if (userChoose == ROUNDS) {
            Calc.playCalcGame();
        } else if (userChoose == FOUR) {
            GCD.playGcdGame();
        } else if (userChoose == FIVE) {
            Progression.playProgressionGame();
        } else if (userChoose == SIX) {
            Prime.playPrimeGame();
        } else {
            System.out.println("Exiting game.");
        }
        sc.close();
    }
}
