public class CompareLength {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};

    if (p1.length < p2.length) {
      System.out.println("P2 has more elements.");
    } else {
      System.out.println("P1 has more elements.");
    }
  }
}