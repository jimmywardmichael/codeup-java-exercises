package FileIoLec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
public class gamesIO {
    public static void main(String[] args) {
        Path path = Paths.get("data/", "games.txt");
        System.out.println(Files.exists(path));
    }
}
