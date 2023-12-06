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
        for (int i = 0; i < roundCount; i++) {
            int int1 = (int)(Math.random() * 100);
            int int2 = (int)(Math.random() * 100);
            roundData[i][0] = int1 + " " + int2;
            roundData[i][1] = String.valueOf(getGcd(int1, int2));
        }
        return roundData;
    }
}
