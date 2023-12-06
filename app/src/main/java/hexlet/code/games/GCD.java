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
        for (var i = 0; i < roundCount; i++) {
            int random_int1 = (int)(Math.random() * 100);
            int random_int2 = (int)(Math.random() * 100);
            roundData[i][0] = random_int1 + " " + random_int2;
            roundData[i][1] = String.valueOf(getGcd(random_int1, random_int2));
        }
        return roundData;
    }
}
