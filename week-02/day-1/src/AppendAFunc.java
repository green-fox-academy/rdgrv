public class AppendAFunc {
  public static void main(String[] args) {
    String typo = "Chinchill";
    appendAFunc(typo);
  }

  public static String appendAFunc (String typo) {
    System.out.println(typo + "a");
    return typo;
  }
}