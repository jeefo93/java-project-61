package hexlet.code;

import hexlet.code.games.*;

public class Invoker {
    public static void playGame(String gameNumber) {

        var roundCount = 3;
        var roundData = new String[roundCount][2];
        var rules = "";

        switch (gameNumber) {

            case "1":
                rules = "Greet";
                break;

            case "2":
                rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                roundData = Even.generateRoundData(roundCount);
                break;

            case "3":
                rules = "What is the result of the expression?";
                roundData = Calc.generateRoundData(roundCount);
                break;

            case "4":
                rules = "Find the greatest common divisor of given numbers.";
                roundData = GCD.generateRoundData(roundCount);
                break;
            
            default:
                break;
        }

        if (!rules.isEmpty()) {
            Engine.run(roundData, rules);
        }
    }
}
