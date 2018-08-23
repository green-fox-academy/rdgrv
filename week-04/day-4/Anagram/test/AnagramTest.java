import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void testAnagram() {
    Anagram anagram = new Anagram();
    String word1 = "taco";
    String word2 = "cato";
    assertEquals(true, anagram.anagramFinder(word1, word2));
  }
}