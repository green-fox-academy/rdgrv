import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome stranger! Let's play Guess My Number! Give me a range: ");
    int range = scanner.nextInt();
    int lives = 5;
    int myNumber = (int) (Math.random() * range);

    System.out.println("So be it. I have a number between 0-" + range + ". You have " + lives + " lives left. What is your first guess? ");

    for (int i = 0; i < 5; i++) {
      lives--;
      int guess = scanner.nextInt();
      if (guess == myNumber) {
        System.out.println("Congratulations! You found my number!");
        break;
      } else if (lives == 0) {
        System.out.println("Sorry, you did not find my number. It was " + myNumber + ". Sorry.");
      } else if (guess > myNumber && lives > 0) {
        System.out.println("Too high.You have " + lives + " lives left.");
      } else if (guess < myNumber && lives > 0) {
        System.out.println("Too low. You have " + lives + " lives left.");
      }
    }
  }
}
