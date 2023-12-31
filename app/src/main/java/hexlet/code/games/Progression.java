package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final int MIN_ADDENDUM_VALUE = 1;
    private static final int MAX_ADDENDUM_VALUE = 100;
    private static final int MAX_START_NUMBER_VALUE = 49;

    private static String[] generateRoundData() {
        var roundData = new String[2];

        int length = Utils.getRandomInt(MIN_LENGTH, MAX_LENGTH);
        var progression = new String[length];
        int addendum = Utils.getRandomInt(MIN_ADDENDUM_VALUE, MAX_ADDENDUM_VALUE);
        int currentNumber = Utils.getRandomInt(0, MAX_START_NUMBER_VALUE);
        int emptySlotIndex = Utils.getRandomInt(0, (length - 1));

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(currentNumber);
            currentNumber += addendum;
        }

        roundData[1] = progression[emptySlotIndex];
        progression[emptySlotIndex] = "..";
        roundData[0] = String.join(" ", progression);
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
