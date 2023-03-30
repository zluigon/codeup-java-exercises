import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"adorable", "adventurous", "aggressive", "busy", "calm", "careful", "cautious", "charming", "cheerful", "clever", "dedicated"};

   static String[] nouns = {"magician", "machine", "lizard", "potato", "jackal", "helmet", "sandwich", "mouse", "helicopter", "pencil", "photon"};

    public static String randomElement(String[] arr) {
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        return arr[randomIndex];
    }

    public static void main(String[] args) {
        String randomAdj = randomElement(adjectives);
        String randomNoun = randomElement(nouns);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s%n", randomAdj, randomNoun);
    }
}
