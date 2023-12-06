package hexlet.code.games;

public class Progression {
    private static String[] generateProgression() {

        String[] progression = new String[2];
        var progressionString = new StringBuilder();

        int progressionLength = (int)((Math.random() * 7) + 5); // progression length is between 5 and 12
        int currentNumber = (int)(Math.random() * 49); // the first progression member is in 0..49
        int addendum = (int)((Math.random() * 99) + 1); // addendum is 0..99 + 1 (must not be zero)
        int emptySlotIndex = (int)(Math.random() * (progressionLength - 1)); // is one of range indexes

        for (int i = 0; i < progressionLength; i++) {
            var currentMember = String.valueOf(currentNumber);

            if (i == emptySlotIndex) {
                progression[1] = currentMember;
                currentMember = "..";
            }

            progressionString.append(currentMember);

            if (i < (progressionLength - 1)) {
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
