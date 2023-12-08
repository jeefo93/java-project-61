package hexlet.code.games;

import hexlet.code.Engine;

public class Greet {

    private static final String rules = "";

    public static void play(int roundCount) {
        var roundsData = new String[roundCount][2];
        Engine.run(roundsData, rules);
    }
}
