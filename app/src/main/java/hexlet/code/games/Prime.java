package hexlet.code.games;

public class Prime {

    private static final int MIN_START_VALUE = 1;
    private static final int MAX_START_VALUE = 500;

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int generateNumber(boolean mustBePrime) {
        int number = (int) ((Math.random() * (MAX_START_VALUE - MIN_START_VALUE)) + MIN_START_VALUE);
        while (isPrime(number) != mustBePrime) {
            number++;
        }
        return number;
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            boolean mustBePrime = (int) (Math.random() * 2) == 0;
            roundData[i][0] = String.valueOf(generateNumber(mustBePrime));
            roundData[i][1] = mustBePrime ? "yes" : "no";
        }
        return roundData;
    }
}
