package hexlet.code.games;

public class MathHelper {
    public static int getRandomIntInRange(int rangeStart, int rangeEnd) {
        return (int) ((Math.random() * (rangeEnd - rangeStart)) + rangeStart);
    }
}
