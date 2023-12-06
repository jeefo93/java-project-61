package hexlet.code.games;

public class Calc {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (var i = 0; i < roundCount; i++) {
            int int1 = (int)(Math.random() * 100);
            int int2 = (int)(Math.random() * 100);

            String action;
            int result;
            int actionNumber = (int)(Math.random() * 3);

            switch (actionNumber) {
                case 0:
                    action = " * ";
                    result = int1 * int2;
                    break;
                case 1:
                    action = " - ";
                    result = int1 - int2;
                    break;
                default:
                    action = " + ";
                    result = int1 + int2;
                    break;
            }

            roundData[i][0] = int1 + action + int2;
            roundData[i][1] = String.valueOf(result);
        }
        return roundData;
    }
}
