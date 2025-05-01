package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int userChoose = sc.nextInt();
        sc.nextLine();

        if (userChoose == 1) {
            Cli.getUserName();
        } else if (userChoose == 2) {
            Even.isEven();
        } else if (userChoose == 3) {
            Calc.playCalcGame();
        } else if (userChoose == 4) {
            GCD.playGcdGame();
        } else if (userChoose == 5) {
            Progression.playProgressionGame();
        } else if (userChoose == 6) {
            Prime.playPrimeGame();
        } else {
            System.out.println("Exiting game.");
        }
        sc.close();
    }
}