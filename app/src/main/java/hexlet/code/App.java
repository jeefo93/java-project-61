package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        System.out.println("""
                            Please enter the game number and press Enter.
                            1 - Greet
                            2 - Even
                            0 - Exit"""
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        Games.playGame(userChoice);
        scanner.close();
    }
}
