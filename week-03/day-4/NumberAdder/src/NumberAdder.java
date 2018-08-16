public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(5));
  }

  public static int numberAdder(int n) {
    if (n == 0) {
      return 0;
    } else {
      return numberAdder(n-1) + n;
    }
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.