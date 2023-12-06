package hexlet.code.games;

public class Progression {
    private static String[] generateProgressionRound(int[] lengthRange,
                                                     int [] addendumRange,
                                                     int [] startNumberRange) {

        String[] progressionRound = new String[2];
        var progressionString = new StringBuilder();

        int length = (int) ((Math.random() * lengthRange[1]) + lengthRange[0]);
        int addendum = (int) ((Math.random() * addendumRange[1]) + addendumRange[0]);
        int currentNumber = (int) ((Math.random() * startNumberRange[1]) + startNumberRange[0]);
        int emptySlotIndex = (int) (Math.random() * (length - 1));

        for (int i = 0; i < length; i++) {
            var slotValue = String.valueOf(currentNumber);

            if (i == emptySlotIndex) {
                progressionRound[1] = slotValue;
                slotValue = "..";
            }

            progressionString.append(slotValue);

            if (i < (length - 1)) {
                progressionString.append(" ");
                currentNumber += addendum;
            }

        }
        progressionRound[0] = progressionString.toString();
        return progressionRound;
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        int[] lengthRange = {5, 7};
        int[] addendumRange = {0, 99};
        int[] startNumberRange = {0, 49};
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgressionRound(lengthRange, addendumRange, startNumberRange);
        }
        return roundData;
    }
}
