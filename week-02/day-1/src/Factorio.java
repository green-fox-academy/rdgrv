import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number: ");

    int number = scanner.nextInt();

    System.out.println("The factorial of the given number is " + factorio(number));
  }

  public static int factorio(int number) {
    int factorio = 1;

    for (int i = 1; i <= number ; i++) {
      factorio = factorio * i;
    }
    return factorio;
  }
}