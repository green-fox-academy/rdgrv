public class Refactorio {
  public static void main(String[] args) {
    System.out.println(refactorio(10));
  }

  public static int refactorio(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * refactorio(n - 1);
    }
  }
}
