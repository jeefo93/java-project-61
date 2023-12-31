package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_INT_VALUE = 100;

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

    private static String[] generateRoundData() {
        var roundData = new String[2];
        int intA = Utils.getRandomInt(0, MAX_INT_VALUE);
        int intB = Utils.getRandomInt(0, MAX_INT_VALUE);

        roundData[0] = intA + " " + intB;
        roundData[1] = String.valueOf(getGcd(intA, intB));

        return roundData;
    }

    public static void play(int roundCount) {
        var roundsData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, RULES);
    }
}
