import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    String filename1 = "assets/win-o.txt";
    String filename2 = "assets/win-x.txt";
    String filename3 = "assets/draw.txt";
    System.out.println(ttt(filename1));
    System.out.println(ttt(filename2));
    System.out.println(ttt(filename3));
  }

  public static String ttt(String filename) {
    try {
      Path path = Paths.get(filename);
      List<String> lines = Files.readAllLines(path);
    } catch (Exception e) {
    }
  }

  // Write a function that takes a filename as string,
  // open and read it. The file data represents a tic-tac-toe
  // game result. Return 'X'/'O'/'draw' based on which player
  // has winning situation.

}