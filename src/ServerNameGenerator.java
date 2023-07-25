import java.util.Random;

public class ServerNameGenerator {
    // Array of adjectives
    private static String[] adjectives = {
            "dedicated", "reliable", "powerful", "fast", "efficient",
            "durable", "versatile", "secure", "scalable", "agile"
    };

    // Array of nouns
    private static String[] nouns = {
            "server", "cloud", "network", "processor", "memory",
            "storage", "photon", "data", "system", "application"
    };

    // Method to return a random element from an array of strings
    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {
        // Select a random noun and adjective
        String noun = getRandomElement(nouns);
        String adjective = getRandomElement(adjectives);

        // Hyphenate the combination and display the generated name to the user
        String serverName = adjective + "-" + noun;
        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }
}
