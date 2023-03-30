import java.util.Random;

public class ServerNameGenerator {

    public static String randomElement(String[] arr) {
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        return arr[randomIndex];
    }

    public static void main(String[] args) {

        String[] adjectives = {"adorable", "adventurous", "aggressive", "busy", "calm", "careful", "cautious", "charming", "cheerful", "clever", "dedicated"};

        String[] nouns = {"magician", "machine", "lizard", "potato", "jackal", "helmet", "sandwich", "mouse", "helicopter", "pencil", "photon"};

        String randomAdj = randomElement(adjectives);
        String randomNoun = randomElement(nouns);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s%n", randomAdj, randomNoun);
    }
}
