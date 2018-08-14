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

    for (int i = 0; i < 3; i++) {
      if (Character.toString(rows.get(i).charAt(0)).equals(Character.toString(rows.get(i).charAt(1))) && Character.toString(rows.get(i).charAt(0)).equals(Character.toString(rows.get(i).charAt(2))) && Character.toString(rows.get(i).charAt(0)).equals("O") ||
          Character.toString(rows.get(0).charAt(i)).equals(Character.toString(rows.get(1).charAt(i))) && Character.toString(rows.get(0).charAt(i)).equals(Character.toString(rows.get(2).charAt(i))) && Character.toString(rows.get(i).charAt(0)).equals("O") ||
          Character.toString(rows.get(0).charAt(0)).equals(Character.toString(rows.get(1).charAt(1))) && Character.toString(rows.get(0).charAt(0)).equals(Character.toString(rows.get(2).charAt(2))) && Character.toString(rows.get(i).charAt(0)).equals("O") ||
          Character.toString(rows.get(0).charAt(2)).equals(Character.toString(rows.get(1).charAt(1))) && Character.toString(rows.get(0).charAt(2)).equals(Character.toString(rows.get(2).charAt(0))) && Character.toString(rows.get(i).charAt(0)).equals("O")) {
        result = "O";
        break;
      } else if (Character.toString(rows.get(i).charAt(0)).equals(Character.toString(rows.get(i).charAt(1))) && Character.toString(rows.get(i).charAt(0)).equals(Character.toString(rows.get(i).charAt(2))) && Character.toString(rows.get(i).charAt(0)).equals("X") ||
          Character.toString(rows.get(0).charAt(i)).equals(Character.toString(rows.get(1).charAt(i))) && Character.toString(rows.get(0).charAt(i)).equals(Character.toString(rows.get(2).charAt(i))) && Character.toString(rows.get(i).charAt(0)).equals("X") ||
          Character.toString(rows.get(0).charAt(0)).equals(Character.toString(rows.get(1).charAt(1))) && Character.toString(rows.get(0).charAt(0)).equals(Character.toString(rows.get(2).charAt(2))) && Character.toString(rows.get(i).charAt(0)).equals("X") ||
          Character.toString(rows.get(0).charAt(2)).equals(Character.toString(rows.get(1).charAt(1))) && Character.toString(rows.get(0).charAt(2)).equals(Character.toString(rows.get(2).charAt(0))) && Character.toString(rows.get(i).charAt(0)).equals("X")) {
        result = "X";
        break;
      } else {
        result = "draw";
      }
    }
    return result;
  }
}
