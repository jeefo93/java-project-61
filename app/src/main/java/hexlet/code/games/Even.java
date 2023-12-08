package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_INT_VALUE = 100;

    private static String[] generateRoundData() {
        var roundData = new String[2];
        int currentInt = Utils.getRandomInt(0, MAX_INT_VALUE);

        roundData[0] = String.valueOf(currentInt);
        roundData[1] = ((currentInt % 2) == 0) ? "yes" : "no";

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
