package hexlet.code.games;

public class Calc {
    private static final int maxIntValue = 100;
    private static final int maxActionNumber = 3;
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];

        for (var i = 0; i < roundCount; i++) {
            String action;
            int intA = MathHelper.getRandomIntInRange(0, maxIntValue);
            int intB = MathHelper.getRandomIntInRange(0, maxIntValue);
            int actionNumber = MathHelper.getRandomIntInRange(0, maxActionNumber);

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
