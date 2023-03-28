import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        highLow();
    }

    public static int gameNumber() {
        return (int) Math.ceil(Math.random() * 100);
    }

    public static void highLow() {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = gameNumber();
        System.out.println(gameNumber);
        System.out.println("A random number between 1 and 100 has been chosen.");
        System.out.println("You'll have a total of 5 tries to guess the number.");
        System.out.println("~~~~~");

        String userConfirm;
        int guessCounter = 1;

        do {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();

            if (userGuess > gameNumber) {
                System.out.println("LOWER");
                System.out.println("guessCounter: " + guessCounter);
            } else if (userGuess < gameNumber) {
                System.out.println("HIGHER");
                System.out.println("guessCounter: " + guessCounter);
            } else {
                System.out.println("GOOD GUESS!");
                System.out.println("Total Guesses: " + guessCounter);
                break;
            }

            if (guessCounter >= 5) {
                System.out.println("Nice try, maybe next time.");
                break;
            }

            guessCounter += 1;
            System.out.println("Would you like to make another guess? [Y/N]");
            userConfirm = scanner.next();

        } while (userConfirm.equalsIgnoreCase("y"));
    }
}

