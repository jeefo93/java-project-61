package hexlet.code.games;

import hexlet.code.Utils;

public class Even {

    private static final int MAX_INT_VALUE = 100;

    private static String[] generateRound() {
        var round = new String[2];

        int currentInt = Utils.getRandomInt(0, MAX_INT_VALUE);

        round[0] = String.valueOf(currentInt);
        round[1] = ((currentInt % 2) == 0) ? "yes" : "no";

        return round;
    }

    public static String[][] generateRoundsData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateRound();
        }
        return roundData;
    }
}
