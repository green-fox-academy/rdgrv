public class Bunnies2 {
  public static void main(String[] args) {
    System.out.println(raisedFeet(3));
  }

  public static int raisedFeet (int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 != 0) {
      return 3 + raisedFeet(n - 1);
    } else {
      return 2 + raisedFeet(n - 1);
    }
  }
}