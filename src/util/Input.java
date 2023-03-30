package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("sure") || input.equalsIgnoreCase("okay");
    }


    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.print("Enter a valid number: ");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userDbl = getDouble();
        if (userDbl >= min && userDbl <= max) {
            System.out.printf("Sweet! %f is within range.", userDbl);
            return userDbl;
        } else {
            System.out.println("I'm sorry, please enter a number within range");
            return getDouble(min, max);
        }
    }

//    Bonus??

}
