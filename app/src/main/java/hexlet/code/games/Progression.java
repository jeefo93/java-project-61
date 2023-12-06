package hexlet.code.games;

public class Progression {
    private static final int minProgressionLength = 5;
    private static final int maxProgressionLength = 12;
    private static final int maxAddendumValue = 100;
    private static final int maxStartNumberValue = 49;

    private static String[] generateProgressionRound() {

        String[] progressionRound = new String[2];
        var progressionString = new StringBuilder();

        int length = MathHelper.getRandomIntInRange(minProgressionLength, maxProgressionLength);
        int addendum = MathHelper.getRandomIntInRange(0, maxAddendumValue);
        int currentNumber = MathHelper.getRandomIntInRange(0, maxStartNumberValue);
        int emptySlotIndex = MathHelper.getRandomIntInRange(0, length - 1);

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
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgressionRound();
        }
        return roundData;
    }
}
