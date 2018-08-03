import java.util.Scanner;
public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 8;
    int userInput;

    System.out.print("Guess the number! Your guess is: ");

    do {
      userInput = scanner.nextInt();
      if (userInput < number) {
        System.out.print("The stored number is higher. Try again: ");
      } else if (userInput > number) {
        System.out.print("The stored number is lower. Try again: ");
      } else {
        System.out.println("You found the number: 8");
      }
    } while (userInput != number);
  }
}