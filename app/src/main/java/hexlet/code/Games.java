package hexlet.code;

public class Games {
    public static void playGame(String gameNumber) {

        var roundData = new String[3][2];
        var rules = "";
        boolean onlyGreet = false;

        switch (gameNumber) {

            case "1":
                onlyGreet = true;
                break;

            case "2":
                rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                for (var i = 0; i < roundData.length; i++) {
                    int random_int = (int)Math.floor(Math.random() * 100);
                    roundData[i][0] =  String.valueOf(random_int);
                    roundData[i][1] = ((random_int % 2) == 0) ? "yes" : "no";
                }
                break;

            default:
                break;
        }

        if (onlyGreet || ! rules.isEmpty()) {
            Engine.run(roundData, rules);
        }
    }
}
