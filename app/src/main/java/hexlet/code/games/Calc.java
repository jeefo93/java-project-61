package hexlet.code.games;

public class Calc {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];

        for (var i = 0; i < roundCount; i++) {

            int int1 = (int)Math.floor(Math.random() * 100);
            int int2 = (int)Math.floor(Math.random() * 100);

            String action = "";
            int actionNumber = (int)Math.floor(Math.random() * 3);

            int actionResult = switch (actionNumber) {
                case 0 -> {
                    action = " * ";
                    yield int1 * int2;
                }
                case 1 -> {
                    action = " - ";
                    yield int1 - int2;
                }
                default -> {
                    action = " + ";
                    yield int1 + int2;
                }
            };

            roundData[i][0] = int1 + action + int2;
            roundData[i][1] = String.valueOf(actionResult);
        }
        return roundData;
    }
}
