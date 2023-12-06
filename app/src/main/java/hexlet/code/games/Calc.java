package hexlet.code.games;

public class Calc {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];

        for (var i = 0; i < roundCount; i++) {
            String action;
            int intA = MathHelper.getRandomIntInRange(0, 100);
            int intB = MathHelper.getRandomIntInRange(0, 100);
            int actionNumber = MathHelper.getRandomIntInRange(0, 3);

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
