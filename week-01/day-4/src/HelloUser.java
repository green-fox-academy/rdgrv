import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Name: ");
    String userInput = scanner.nextLine();

    System.out.println("Hello, " + userInput + "!");
  }
}
