package hexlet.code.games;

import hexlet.code.Utils;

public class Even {

    private static final int MAX_INT_VALUE = 100;

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];

        for (int i = 0; i < roundCount; i++) {
            int currentInt = Utils.getRandomInt(0, MAX_INT_VALUE);
            roundData[i][0] = String.valueOf(currentInt);
            roundData[i][1] = ((currentInt % 2) == 0) ? "yes" : "no";
        }

        return roundData;
    }
}
