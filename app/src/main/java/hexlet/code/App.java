package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        System.out.println("""
                            Please enter the game number and press Enter.\s
                            1 - Greet\s
                            2 - Even\s
                            0 - Exit\s
                            """
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        Games.playGame(userChoice);
        scanner.close();
    }
}
