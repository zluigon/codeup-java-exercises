import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to talk to Bob? [Y/N]");

        boolean userConfirm = scanner.nextLine().equalsIgnoreCase("y");


        if (userConfirm) {
            System.out.println("If you'd like to stop talking to Bob, say \"Goodbye\".");
            System.out.println("What would you like to say: ");
            String userResponse = scanner.nextLine();
            while (!userResponse.equalsIgnoreCase("goodbye")) {
                if (userResponse.endsWith("?")) {
                    System.out.println("Bob: Sure");
                } else if (userResponse.endsWith("!")) {
                    System.out.println("Bob: Whoa, chill out!");
                } else if (userResponse.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Bob: Whatever.");
                }
                userResponse = scanner.nextLine();
            }
            System.out.println("Goodbye.");
        } else {
            System.out.println("Okay, maybe next time.");
        }
    }
}