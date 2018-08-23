import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  public boolean anagramFinder(String word1, String word2) {
    ArrayList<String> anagram1 = new ArrayList<>(Arrays.asList(word1.split("")));
    ArrayList<String> anagram2 = new ArrayList<>(Arrays.asList(word2.split("")));

    return (anagram1.containsAll(anagram2) && anagram2.containsAll(anagram1));
  }
}