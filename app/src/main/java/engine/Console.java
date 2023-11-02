package engine;

import java.util.Scanner;

public class Console {

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readStr(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

    public static int readInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
