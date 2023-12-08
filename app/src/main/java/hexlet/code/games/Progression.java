package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final int MAX_ADDENDUM_VALUE = 100;
    private static final int MAX_START_NUMBER_VALUE = 49;

    private static String[] generateRound() {

        var round = new String[2];
        var stringBuilder = new StringBuilder();

        int length = Utils.getRandomInt(MIN_LENGTH, MAX_LENGTH);
        int addendum = Utils.getRandomInt(0, MAX_ADDENDUM_VALUE);
        int currentNumber = Utils.getRandomInt(0, MAX_START_NUMBER_VALUE);
        int emptySlotIndex = Utils.getRandomInt(0, (length - 1));

        for (int i = 0; i < length; i++) {

            var slotValue = String.valueOf(currentNumber);

            if (i == emptySlotIndex) {
                round[1] = slotValue;
                slotValue = "..";
            }

            stringBuilder.append(slotValue);

            if (i < (length - 1)) {
                stringBuilder.append(" ");
                currentNumber += addendum;
            }

        }

        round[0] = stringBuilder.toString();
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
