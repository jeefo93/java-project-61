package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Invoker {
    private static final int roundCount = 3;

    public static void playGame(String gameNumber) {
        var roundData = new String[roundCount][2];
        var rules = switch (gameNumber) {
            default -> "";
            case "1" -> "Greet";
            case "2" -> {
                roundData = Even.generateRoundData(roundCount);
                yield "Answer 'yes' if the number is even, otherwise answer 'no'.";
            }
            case "3" -> {
                roundData = Calc.generateRoundData(roundCount);
                yield "What is the result of the expression?";
            }
            case "4" -> {
                roundData = GCD.generateRoundData(roundCount);
                yield "Find the greatest common divisor of given numbers.";
            }
            case "5" -> {
                roundData = Progression.generateRoundData(roundCount);
                yield "What number is missing in the progression?";
            }
            case "6" -> {
                roundData = Prime.generateRoundData(roundCount);
                yield "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            }
        };
        if (!rules.isEmpty()) {
            Engine.run(roundData, rules);
        }
    }
}
