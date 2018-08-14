import java.nio.file.Path;
import java.nio.file.Paths;

public class TicTacToe {

  public static void main(String[] args) {
    String filename1 = "assets/win-o.txt";
    Path path = Paths.get(filename1);
    String filename2 = "assets/win-x.txt";
    Path path = Paths.get(filename2);
    String filename3 = "assets/draw.txt";
    Path path = Paths.get(filename3);
    System.out.println(ttt(filename1));
    System.out.println(ttt(filename2));
    System.out.println(ttt(filename3));
  }

  public static String ttt(String filename) {

    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"))
    // should print O

    System.out.println(ticTacResult("win-x.txt"))
    // should print X

    System.out.println(ticTacResult("draw.txt"))
    // should print draw
  }
}