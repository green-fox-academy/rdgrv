import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a filename: ");
    String fileName = scanner.nextLine();
    System.out.println(numberOfLines(fileName));
  }

  public static int numberOfLines(String fileName) {
    try {
      Path path = Paths.get(fileName);
      List<String> lines = Files.readAllLines(path);
      int numberOfLines = 0;
      for (String line : lines) {
        numberOfLines++;
      }
      return numberOfLines;
    } catch (Exception e) {
      return 0;
    }
  }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
