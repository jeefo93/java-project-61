package hexlet.code.games;

public class Progression {
    private static String[] generateProgressionRound(int minProgressionLength,
                                                     int maxProgressionLength,
                                                     int maxAddendumValue,
                                                     int maxStartNumberValue) {

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
        var minProgressionLength = 5;
        var maxProgressionLength = 12;
        var maxAddendumValue = 100;
        var maxStartNumberValue = 49;
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgressionRound(minProgressionLength,
                    maxProgressionLength, maxAddendumValue, maxStartNumberValue);
        }
        return roundData;
    }
}
