package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Invoker {

    private static final int ROUND_COUNT = 3;

    public static void playGame(String gameNumber) {
        var roundData = new String[ROUND_COUNT][2];

        var rules = switch (gameNumber) {
            case "1" -> "Greet";

            case "2" -> {
                roundData = Even.generateRoundData(ROUND_COUNT);
                yield "Answer 'yes' if the number is even, otherwise answer 'no'.";
            }
            case "3" -> {
                roundData = Calc.generateRoundData(ROUND_COUNT);
                yield "What is the result of the expression?";
            }
            case "4" -> {
                roundData = GCD.generateRoundData(ROUND_COUNT);
                yield "Find the greatest common divisor of given numbers.";
            }
            case "5" -> {
                roundData = Progression.generateRoundData(ROUND_COUNT);
                yield "What number is missing in the progression?";
            }
            case "6" -> {
                roundData = Prime.generateRoundData(ROUND_COUNT);
                yield "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            }

            default -> "";
        };

        if (!rules.isEmpty()) {
            Engine.run(roundData, rules);
        }

    }
}
