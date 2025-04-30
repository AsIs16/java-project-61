package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int userChoose = sc.nextInt();
        if (userChoose == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greetUser();
        } else {
            return;
        }

//        Cli.greetUser();
    }
}
