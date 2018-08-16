public class Main {
  public static void main(String[] args) {

    String string = "xaaax I'm so happxxx";
    int stringLength = string.length();
    System.out.println(characterChanger(string, stringLength));
  }

  public static String characterChanger (String a, int b) {
    if (!Character.toString(a.charAt(b - 1)).equals("x")) {
      return Character.toString(a.charAt(b - 1));
    } else {
      return a.replace("x", "y");
    }
  }
}