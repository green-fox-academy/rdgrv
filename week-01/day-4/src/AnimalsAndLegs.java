import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number of chickens: ");

    int userInput1 = scanner.nextInt();

    System.out.print("Number of pigs: ");

    int userInput2 = scanner.nextInt();

    System.out.println("Number of legs: " + (userInput1 * 2 + userInput2 * 4));
  }
}
