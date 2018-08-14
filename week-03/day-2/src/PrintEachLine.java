import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("my-file.txt");
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}