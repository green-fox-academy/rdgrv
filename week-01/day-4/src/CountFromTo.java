import java.util.Scanner;
public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number: ");
    int number1 = scanner.nextInt();

    System.out.print("Give me another number: ");
    int number2 = scanner.nextInt();

    if (number2 <= number1) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = number1; i < number2; i++) {
        System.out.println(i);
      }
    }
  }
}


