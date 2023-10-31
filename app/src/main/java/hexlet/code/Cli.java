package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String readHost(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message + " ");
        String output = scanner.next();
        scanner.close();
        return output;
    }
}
