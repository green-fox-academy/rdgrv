import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the file path: ");
    String filePath = scanner.nextLine();
    Path path = Paths.get(filePath);

    System.out.print("Enter word you want to write: ");
    String word = scanner.nextLine();

    System.out.print("Enter how many times you want to write the word: ");
    int number = scanner.nextInt();

    writer(path, word, number);
  }

  public static void writer(Path path, String word, int number) {
    List<String> content = new ArrayList();

    for (int i = 0; i < number; i++) {
      content.add(word);
    }

    try {
      Files.write(path, content);
    } catch (Exception e) {
      System.out.println("Unable to write file");
    }
  }
}