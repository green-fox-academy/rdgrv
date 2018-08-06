import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int total = 0;
    System.out.print("Enter first number: ");

    int number1 = scanner.nextInt();

    System.out.print("Enter second number: ");

    int number2 = scanner.nextInt();

    System.out.println(sum(total, number1, number2));
  }

  public static int sum(int total, int number1, int number2) {
    total = number1 + number2;
    return total;
  }
}