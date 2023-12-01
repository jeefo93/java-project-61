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
                rules = Even.getRules();
                roundData = Even.generateRoundData(roundCount);
                break;

            case "3":
                rules = Calc.getRules();
                roundData = Calc.generateRoundData(roundCount);
                break;

            case "4":
                rules = GCD.getRules();
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
