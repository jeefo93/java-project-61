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
        int maxIntValue = 100;
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            int intA = (int) (Math.random() * maxIntValue);
            int intB = (int) (Math.random() * maxIntValue);
            roundData[i][0] = intA + " " + intB;
            roundData[i][1] = String.valueOf(getGcd(intA, intB));
        }
        return roundData;
    }
}
