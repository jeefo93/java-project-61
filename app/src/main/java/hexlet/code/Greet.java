package hexlet.code;

import engine.Console;

public class Greet {
    public static void printList(String welcomeMsg,
         int firstNum, String firstName,
         int lastNum, String lastName,
         String[] list, int listStartNum, int listEndNum, String separator
    ) {

        Console.writeMessage(welcomeMsg);
        Console.writeMessage(firstNum + separator + firstName);
        for (int optionNumber = listStartNum; optionNumber <= listEndNum; optionNumber++) {
            Console.writeMessage(optionNumber + separator + list[optionNumber - listStartNum]);
        }
        Console.writeMessage(lastNum + separator + lastName);
    }

    public static String requestUserName(String welcomeMsg, String prompt, String greet) {
        Console.writeMessage(welcomeMsg);
        String userName = Console.readStr(prompt);
        Console.writeMessage(greet + userName + "!");
        return userName;
    }
}
