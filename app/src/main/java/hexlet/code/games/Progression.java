package hexlet.code.games;

public class Progression {
    private static String[] generateProgression() {

        String[] progression = new String[2];
        var progressionString = new StringBuilder();

        int length = (int)((Math.random() * 7) + 5); // progression length is between 5 and 12
        int addendum = (int)((Math.random() * 99) + 1); // addendum is 0..99 + 1 (must not be zero)
        int currentNumber = (int)(Math.random() * 49);
        int emptySlotIndex = (int)(Math.random() * (length - 1));

        for (int i = 0; i < length; i++) {
            var slotValue = String.valueOf(currentNumber);

            if (i == emptySlotIndex) {
                progression[1] = slotValue;
                slotValue = "..";
            }

            progressionString.append(slotValue);

            if (i < (length - 1)) {
                progressionString.append(" ");
                currentNumber += addendum;
            }

        }
        progression[0] = progressionString.toString();
        return progression;
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgression();
        }
        return roundData;
    }
}
