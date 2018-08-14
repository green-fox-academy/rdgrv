import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number: ");
    int number = scanner.nextInt();
    divide(number);
  }

  public static void divide(int number) {
    int result = 0;
    try {
      result = 10 / number;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}