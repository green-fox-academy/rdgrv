public class Shifter implements CharSequence {
  String string;
  int shifter;

  public Shifter(String string, int shifter) {
    this.string = string;
    this.shifter = shifter;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.substring(shifter).charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.substring(start, end);
  }
}
