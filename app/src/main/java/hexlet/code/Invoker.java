package hexlet.code;

import hexlet.code.games.*;

public class Invoker {
    public static void playGame(String gameNumber) {
        var roundCount = 3;
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
        };

        if (!rules.isEmpty()) {
            Engine.run(roundData, rules);
        }
    }
}
