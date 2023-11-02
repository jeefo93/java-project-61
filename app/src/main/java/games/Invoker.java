package games;

public class Invoker {
    private static final String[] gameList = {
        "Even"
    };

    public static String[] getGameList() {
        return gameList;
    }

    public static boolean playGame(String gameName) {
        switch (gameName) {
            case "Even":
                return games.content.Even.play();
            default:
                return false;
        }
    }
}
