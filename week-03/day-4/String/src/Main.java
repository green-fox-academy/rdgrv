public class Main {

  public static void main(String[] args) {
    String string = "xaaax I am so happxxxxxxxxx";
    System.out.println(recString(string));
  }


  public static String recString(String a) {
    if (a.length() == 0) {
      return a;
    } else if (a.startsWith("x")) {
      return "y" + recString(a.substring(1));
    } else {
      return a.charAt(0) + recString(a.substring(1));
    }
  }
}