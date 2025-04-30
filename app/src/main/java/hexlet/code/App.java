package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int userChoose = sc.nextInt();
        if (userChoose == 1) {
            Cli.greetUser();
        } else if (userChoose == 2) {
            Even.isEven();
        } else {
            return;
        }
    }
}
