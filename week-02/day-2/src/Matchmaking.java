import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
    makingMatches(girls, boys);
  }

  public static void makingMatches(ArrayList girls, ArrayList boys) {

    for (int i = 0; i < girls.size(); i++) {
      System.out.print(girls.get(i) + ", " + boys.get(i) + ", ");
    }
  }
}