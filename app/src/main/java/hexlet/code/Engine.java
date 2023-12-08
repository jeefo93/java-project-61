package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String[][] roundsData, String rules) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");

            if (roundsData[0][0] == null) {
                return;
            }

            System.out.println(rules);
            for (int i = 0; i <= roundsData.length; i++) {
                System.out.print("Question: " + roundsData[i][0] + "\nYour answer: ");
                String answer = scanner.next();

                if (!answer.equals(roundsData[i][1])) {
                    System.out.println("'" + answer + "' "
                            + "is wrong answer ;(. Correct answer was '" + roundsData[i][1] + "'.\n"
                            + "Let's try again, " + userName + "!");
                    return;
                }

                System.out.println("Correct!");
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
