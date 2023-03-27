import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to say to Bob?");
        String userResponse;

        do {
            System.out.println("If you'd like to stop talking to Bob, say \"Goodbye\".");
            userResponse = scanner.nextLine();
            if (userResponse.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userResponse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userResponse.equalsIgnoreCase("goodbye")) {
                System.out.println("Bob: Later.");
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while (!userResponse.equalsIgnoreCase("goodbye"));
    }
}
