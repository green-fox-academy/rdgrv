public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnies(1000));

  }

  public static int bunnies(int n) {
    if (n == 0) {
      return 0;
    } else {
      return 2 + bunnies(n - 1);
    }
  }
}