import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me two words. Hit enter after each.");
    String word1 = scanner.nextLine();
    String word2 = scanner.nextLine();
    if (word1.length() != word2.length()) {
      System.out.println("The two words cannot be anagrams since the number of characters is not equal.");
    } else if (anagram(word1, word2)) {
      System.out.println("Congratulations, you found two anagrams!");
    } else {
      System.out.println("Unfortunately, the two words are not anagrams.");
    }
  }

  public static boolean anagram(String word1, String word2) {
    ArrayList<String> anagram1 = new ArrayList<>(Arrays.asList(word1.split("")));
    ArrayList<String> anagram2 = new ArrayList<>(Arrays.asList(word2.split("")));

    return (anagram1.containsAll(anagram2) && anagram2.containsAll(anagram1));
  }
}