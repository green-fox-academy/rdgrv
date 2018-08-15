import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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
    ArrayList<String> rows = new ArrayList<>();
    String result = "";
    try {
      Path path = Paths.get(filename);
      rows.addAll(Files.readAllLines(path));
    } catch (Exception e) {
    }

    for (int i = 0; i < rows.size(); i++) {
      if (xOrO(rows, i, "O")) {
        result = "O";
        break;
      } else if (xOrO(rows, i, "X")) {
        result = "X";
        break;
      } else {
        result = "draw";
      }
    }
    return result;
  }

  public static String getChar(ArrayList<String> rows, int row, int character) {
    return Character.toString(rows.get(row).charAt(character));
  }

  public static boolean xOrO(ArrayList<String> rows, int i, String a) {
    return getChar(rows, i, 0).equals(getChar(rows, i, 1)) && getChar(rows, i, 0).equals(getChar(rows, i, 2)) && getChar(rows, i, 0).equals(a) ||
        getChar(rows, 0, i).equals(getChar(rows, 1, i)) && getChar(rows, 0, i).equals(getChar(rows, 2, i)) && getChar(rows, 0, i).equals(a) ||
        getChar(rows, 0, 0).equals(getChar(rows, 1, 1)) && getChar(rows, 0, 0).equals(getChar(rows, 2, 2)) && getChar(rows, 0, 0).equals(a) ||
        getChar(rows, 0, 2).equals(getChar(rows, 1, 1)) && getChar(rows, 0, 2).equals(getChar(rows, 2, 0)) && getChar(rows, 0, 2).equals(a);
  }
}
