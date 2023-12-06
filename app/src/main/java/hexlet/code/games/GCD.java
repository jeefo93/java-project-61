package hexlet.code.games;

public class GCD {
    private static int getGcd(int intA, int intB) {
        int max = Math.max(intA, intB);
        int gcd = (max == 0) ? 0 : 1;

        for (int i = 1; i <= max; i++) {
            if (intA % i == 0 && intB % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        var maxIntValue = 100;
        for (int i = 0; i < roundCount; i++) {
            int intA = MathHelper.getRandomIntInRange(0, maxIntValue);
            int intB = MathHelper.getRandomIntInRange(0, maxIntValue);
            roundData[i][0] = intA + " " + intB;
            roundData[i][1] = String.valueOf(getGcd(intA, intB));
        }
        return roundData;
    }
}
