import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFiles {
  public static void main(String[] args) {
    String file1 = "assets/my-file.txt";
    String file2 = "assets/my-file2.txt";
    System.out.println(copy(file1, file2));
  }

  public static boolean copy(String file1, String file2) {
    Path path1 = Paths.get(file1);
    Path path2 = Paths.get(file2);
    try {
      List<String> lines1 = Files.readAllLines(path1);
      Files.write(path2, lines1);
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful