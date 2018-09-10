import java.util.stream.Collectors;

public class Ex7 {
  public static void main(String[] args) {
    String string = "This is an example sentence to find the frequency of characters";

    System.out.println(string.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
