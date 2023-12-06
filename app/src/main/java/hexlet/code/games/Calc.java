package hexlet.code.games;

public class Calc {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        int maxIntValue = 100;
        int maxActionNumber = 3;

        for (var i = 0; i < roundCount; i++) {
            String action;
            int intA = (int) (Math.random() * maxIntValue);
            int intB = (int) (Math.random() * maxIntValue);
            int actionNumber = (int) (Math.random() * maxActionNumber);

            int actionResult = switch (actionNumber) {
                case 0 -> {
                    action = " + ";
                    yield intA + intB;
                }
                case 1 -> {
                    action = " - ";
                    yield intA - intB;
                }
                default -> {
                    action = " * ";
                    yield intA * intB;
                }
            };
            roundData[i][0] = intA + action + intB;
            roundData[i][1] = String.valueOf(actionResult);
        }

        return roundData;
    }
}
