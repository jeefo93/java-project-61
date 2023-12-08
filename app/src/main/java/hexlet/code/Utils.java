package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int rangeStart, int rangeEnd) {
        Random random = new Random();
        return random.nextInt(rangeEnd - rangeStart) + rangeStart;
    }
}
