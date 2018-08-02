import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Distance in kilometers: ");

    int userInput = scanner.nextInt();

    double mile = 0.621371192;

    System.out.println("Distance in miles: " + userInput * mile);
  }
}
