import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(string.length() - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String normal = "";
    for (int i = 0; i < string.length(); i++) {
      normal = normal + string.charAt(string.length() - i - 1);
    }
    return normal.substring(start, end);
  }
}
