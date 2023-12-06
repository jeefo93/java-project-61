package hexlet.code.games;

public class Even {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        var maxIntValue = 100;
        for (int i = 0; i < roundCount; i++) {
            int currentInt = MathHelper.getRandomIntInRange(0, maxIntValue);
            roundData[i][0] = String.valueOf(currentInt);
            roundData[i][1] = ((currentInt % 2) == 0) ? "yes" : "no";
        }
        return roundData;
    }
}
