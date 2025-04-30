package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
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
        } else {
            System.out.println("Exiting game.");
        }
        sc.close();
    }
}