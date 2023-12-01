package hexlet.code.games;

public class Even {
    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (var i = 0; i < roundCount; i++) {
            int random_int = (int)Math.floor(Math.random() * 100);
            roundData[i][0] = String.valueOf(random_int);
            roundData[i][1] = ((random_int % 2) == 0) ? "yes" : "no";
        }
        return roundData;
    }
}
