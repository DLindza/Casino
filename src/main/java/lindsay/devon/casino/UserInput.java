package lindsay.devon.casino;

import java.util.Scanner;

/**
 * Created by devon on 10/2/16.
 */
public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public String inputString() {
        String userString = scanner.next();
        return userString;
    }

    public double inputDouble() {
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
