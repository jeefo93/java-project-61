package hexlet.code.games;

public class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final int MAX_ADDENDUM_VALUE = 100;
    private static final int MAX_START_NUMBER_VALUE = 49;

    private static String[] generateProgressionRound() {

        var progressionRound = new String[2];
        var stringBuilder = new StringBuilder();

        int length = (int) ((Math.random() * (MAX_LENGTH - MIN_LENGTH)) + MIN_LENGTH);
        int addendum = (int) (Math.random() * MAX_ADDENDUM_VALUE);
        int currentNumber = (int) (Math.random() * MAX_START_NUMBER_VALUE);
        int emptySlotIndex = (int) (Math.random() * (length - 1));

        for (int i = 0; i < length; i++) {

            var slotValue = String.valueOf(currentNumber);

            if (i == emptySlotIndex) {
                progressionRound[1] = slotValue;
                slotValue = "..";
            }

            stringBuilder.append(slotValue);

            if (i < (length - 1)) {
                stringBuilder.append(" ");
                currentNumber += addendum;
            }

        }

        progressionRound[0] = stringBuilder.toString();
        return progressionRound;

    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgressionRound();
        }
        return roundData;
    }
}
