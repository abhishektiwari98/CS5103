package CS5103;

import java.util.Scanner;

/**
 * Common utilities for the application.
 */
public class Utils {
    public static String getInput() {
        System.out.println("Enter the input String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        return input;
    }
}
