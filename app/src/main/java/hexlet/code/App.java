package hexlet.code;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        limRan();
    }

    private static void limRan() {
        Random ran = new Random();
        int i = ran.nextInt(1, 400);
    }
}
