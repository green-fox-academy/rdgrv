import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int total = 0;
    int userInput;

    System.out.print("How many numbers have you got? ");

    int totalnumbers = scanner.nextInt();

    for (int i = 0; i < totalnumbers; i++) {
      System.out.print("Number: ");
      userInput = scanner.nextInt();
      total = total + userInput;
    }

    double average = (double) total / (double) totalnumbers;

    if (average % 1 != 0) {
      System.out.println("Sum: " + total + ", Average: " + average);
    } else {
      System.out.println("Sum: " + total + ", Average: " + Math.round(average));
    }
  }
}
