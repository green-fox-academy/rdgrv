public class Power {
  public static void main(String[] args) {
    System.out.println(power(10, 10));
  }

  public static long power (long n, long p) {
    if (p == 0) {
      return 1;
    } else {
      return n * power(n, p - 1);
    }
  }
}