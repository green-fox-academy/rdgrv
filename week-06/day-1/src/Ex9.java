import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex9 {
  public static void main(String[] args) {
    char charArray[] = {'a', 'b', 'c'};

    System.out.println(Stream.of(charArray)
        .map(c -> String.valueOf(c))
        .collect(Collectors.joining()));
  }
}
