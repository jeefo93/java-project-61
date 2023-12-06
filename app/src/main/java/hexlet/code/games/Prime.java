package hexlet.code.games;

public class Prime {
    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int generateNumber(int startFrom, boolean isPrimeNeeded) {
        var resultNumber = startFrom;
        for (int i = resultNumber; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i) == isPrimeNeeded) {
                resultNumber = i;
                break;
            }
        }
        return resultNumber;
    }
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            int startFrom = (int)(Math.random() * 500);
            boolean isPrimeNeeded = (int)(Math.random() * 2) == 0;
            roundData[i][0] = String.valueOf(generateNumber(startFrom, isPrimeNeeded));
            roundData[i][1] = isPrimeNeeded ? "yes" : "no";
        }
        return roundData;
    }
}
