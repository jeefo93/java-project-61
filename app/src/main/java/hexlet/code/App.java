package hexlet.code;

import engine.Console;
import games.Invoker;

public class App {
    public static void main(String[] args) {

        String[] gameList = Invoker.getGameList();
        int lastAvailableChoiceNumber = gameList.length + 1;

        int exitChoiceNumber = 0;
        int greetChoiceNumber = 1;
        int gameListStartNumber = 2;

        Console.writeMessage("Please enter the game number and press Enter.");
        Console.writeMessage(greetChoiceNumber + " - " + "Greet");
        for (int optionNumber = gameListStartNumber; optionNumber <= lastAvailableChoiceNumber; optionNumber++) {
            Console.writeMessage(optionNumber + " - " + gameList[optionNumber - gameListStartNumber]);
        }
        Console.writeMessage(exitChoiceNumber + " - " + "Exit");

        int userChoice = Console.readInt("Your choice: ");

        if (userChoice == exitChoiceNumber) {
            Console.writeMessage("Good bye!");
        } else if (userChoice < exitChoiceNumber || userChoice > lastAvailableChoiceNumber) {
            Console.writeMessage("There is no game with the given number.");
        } else {
            String userName = Greet.requestUserName();
            if (userChoice != greetChoiceNumber) {
                String gameName = gameList[userChoice - gameListStartNumber];
                boolean userWon = Invoker.playGame(gameName);
                String exitMessage = userWon ? "Congratulations, " : "Let's try again, ";
                Console.writeMessage(exitMessage + userName + "!");
            }
        }
    }
}
