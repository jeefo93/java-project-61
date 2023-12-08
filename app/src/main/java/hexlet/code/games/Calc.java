package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_INT_VALUE = 100;
    private static final String[] ACTION_LABELS = {"+", "-", "*"};

    private static int getActionResult(int intA, int intB, String actionLabel) {
        return switch (actionLabel) {
            case "+" -> intA + intB;
            case "-" -> intA - intB;
            default -> intA * intB;
        };
    }

    private static String[] generateRoundData() {
        var roundData = new String[2];

        int intA = Utils.getRandomInt(0, MAX_INT_VALUE);
        int intB = Utils.getRandomInt(0, MAX_INT_VALUE);
        int actionIndex = Utils.getRandomInt(0, (ACTION_LABELS.length - 1));
        var actionLabel = ACTION_LABELS[actionIndex];
        int actionResult = getActionResult(intA, intB, actionLabel);

        roundData[0] = intA + " " + actionLabel + " " + intB;
        roundData[1] = String.valueOf(actionResult);
        return roundData;
    }

    public static void play(int roundCount) {
        var roundsData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, RULES);
    }
}
