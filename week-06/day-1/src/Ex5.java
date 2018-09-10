import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
  public static void main(String[] args) {
    String string = "There Are Some Uppercase Letters In This Sentence";

    List<Character> upperCaseCharacters = string.chars()
        .mapToObj(x -> (char) x)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());

    System.out.println(upperCaseCharacters);

    //Solution 2

    string
        .chars()
        .filter(c -> Character.isUpperCase(c))
        .mapToObj(c -> (char) c)
        .forEach(System.out::println);
  }
}
