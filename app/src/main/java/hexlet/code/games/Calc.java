package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    private static final int MAX_INT_VALUE = 100;
    private static final String[] ACTIONS = {"+", "-", "*"};

    private static int getActionResult(int intA, int intB, String actionLabel) {
        return switch (actionLabel) {
            case "+" -> intA + intB;
            case "-" -> intA - intB;
            default -> intA * intB;
        };
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];

        for (var i = 0; i < roundCount; i++) {

            int intA = Utils.getRandomInt(0, MAX_INT_VALUE);
            int intB = Utils.getRandomInt(0, MAX_INT_VALUE);

            int actionNumber = Utils.getRandomInt(0, (ACTIONS.length - 1));
            var actionLabel = ACTIONS[actionNumber];
            int actionResult = getActionResult(intA, intB, actionLabel);

            roundData[i][0] = intA + " " + actionLabel + " " + intB;
            roundData[i][1] = String.valueOf(actionResult);

        }
        return roundData;
    }
}
