package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    private static final int ROUND_COUNT = 3;

    public static void main(String[] args) {

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s"""
        );

        try (Scanner scanner = new Scanner(System.in)) {

            String userChoice = scanner.next();
            switch (userChoice) {
                case "1" -> Greet.play(ROUND_COUNT);
                case "2" -> Even.play(ROUND_COUNT);
                case "3" -> Calc.play(ROUND_COUNT);
                case "4" -> GCD.play(ROUND_COUNT);
                case "5" -> Progression.play(ROUND_COUNT);
                case "6" -> Prime.play(ROUND_COUNT);
                default -> { }
            }

        }
    }
}
