package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String[][] roundData, String rules) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        if (roundData[0][0] == null) {
            return;
        }

        System.out.println(rules);
        var lastRoundNum = roundData.length - 1;
        for (var i = 0; i <= lastRoundNum; i++) {
            System.out.println("Question: " + roundData[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals(roundData[i][1])){
                System.out.println("'" + answer + "' " +
                        "is wrong answer ;(. Correct answer was '" +
                        roundData[i][1] + "'.\n" +
                        "Let's try again, " + userName + "!"
                );
                break;
            }
            System.out.println("Correct!" +
                               (i != lastRoundNum ? "" :
                                       "\nCongratulations, " + userName + "!")
            );
        }
        scanner.close();
    }
}
