package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_START_VALUE = 1;
    private static final int MAX_START_VALUE = 500;
    private static final int PRIME_RANDOMIZER_RANGE = 3;

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int generateNumber(boolean mustBePrime) {
        int number = Utils.getRandomInt(MIN_START_VALUE, MAX_START_VALUE);
        while (isPrime(number) != mustBePrime) {
            number++;
        }
        return number;
    }

    private static String[] generateRound() {
        var round = new String[2];

        boolean mustBePrime = Utils.getRandomInt(0, PRIME_RANDOMIZER_RANGE) == 0;
        round[0] = String.valueOf(generateNumber(mustBePrime));
        round[1] = mustBePrime ? "yes" : "no";

        return round;
    }

    public static void play(int roundCount) {
        var roundsData = new String[roundCount][2];
        for (int i = 0; i < roundCount; i++) {
            roundsData[i] = generateRound();
        }
        Engine.run(roundsData, RULES);
    }
}
