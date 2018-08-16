public class Main {
  public static void main(String[] args) {

    String string = "xaaax I'm so happxxx";
    int stringLength = string.length();
    System.out.println(characterChanger(string, stringLength));
  }

  public static String characterChanger (String a, int b) {
    if (b == 0) {
      return a.replace("x", "y");
    } else {
      return characterChanger(a, b - 1);
    }
  }
}