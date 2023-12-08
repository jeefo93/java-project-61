package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    private static final int MAX_INT_VALUE = 100;
    private static final int MAX_ACTION_NUMBER = 2;

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        String action;

        for (var i = 0; i < roundCount; i++) {

            int intA = Utils.getRandomInt(0, MAX_INT_VALUE);
            int intB = Utils.getRandomInt(0, MAX_INT_VALUE);
            int actionNumber = Utils.getRandomInt(0, MAX_ACTION_NUMBER);

            int actionResult = switch (actionNumber) {
                case 0 -> {
                    action = " + ";
                    yield intA + intB;
                }
                case 1 -> {
                    action = " - ";
                    yield intA - intB;
                }
                default -> {
                    action = " * ";
                    yield intA * intB;
                }
            };

            roundData[i][0] = intA + action + intB;
            roundData[i][1] = String.valueOf(actionResult);

        }
        return roundData;
    }
}
