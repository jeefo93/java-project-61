package hexlet.code;

import engine.Console;

public class Greet {
    public static String requestUserName() {
        Console.writeMessage("Welcome to the Brain Games!");
        String userName = Console.readStr("May I have your name? ");
        Console.writeMessage("Hello, " + userName + "!");
        return userName;
    }
}
