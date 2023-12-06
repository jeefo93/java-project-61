package hexlet.code.games;

public class Progression {
    private static String[] generateProgression() {

        String[] progression = new String[2];
        var progressionString = new StringBuilder();

        int rangeLength = (int)((Math.random() * 7) + 5);
        int currentNumber = (int)(Math.random() * 49);
        int addendum = (int)((Math.random() * 99) + 1);
        int emptySlotNumber = (int)(Math.random() * (rangeLength - 1));

        for (int i = 0; i < rangeLength; i++) {
            var currentMember = String.valueOf(currentNumber);

            if (i == emptySlotNumber) {
                progression[1] = currentMember;
                currentMember = "..";
            }

            progressionString.append(currentMember);

            if (i < (rangeLength - 1)) {
                progressionString.append(" ");
                currentNumber += addendum;
            }

        }
        progression[0] = progressionString.toString();
        return progression;
    }

    public static String[][] generateRoundData(int roundCount) {
        String[][] roundData = new String[roundCount][2];

        for (int i = 0; i < roundCount; i++) {
            roundData[i] = generateProgression();
        }
        return roundData;
    }
}
