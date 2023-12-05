package hexlet.code.games;

public class Calc {
    public static String[][] generateRoundData(int roundCount) {
        var roundData = new String[roundCount][2];
        for (var i = 0; i < roundCount; i++) {
            int random_int1 = (int)Math.floor(Math.random() * 100);
            int random_int2 = (int)Math.floor(Math.random() * 100);
            int randomActionNumber = (int)Math.floor(Math.random() * 3);
            switch (randomActionNumber) {
                case 0:
                    roundData[i][0] = random_int1 + " * " + random_int2;
                    roundData[i][1] = String.valueOf(random_int1 * random_int2);
                    break;
                case 1:
                    roundData[i][0] = random_int1 + " - " + random_int2;
                    roundData[i][1] = String.valueOf(random_int1 - random_int2);
                    break;
                default:
                    roundData[i][0] = random_int1 + " + " + random_int2;
                    roundData[i][1] = String.valueOf(random_int1 + random_int2);
                    break;
            }
        }
        return roundData;
    }
}
