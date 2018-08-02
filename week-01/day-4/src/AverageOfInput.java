import java.util.Scanner;
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number: ");
    int userInput1 = scanner.nextInt();
    System.out.print("Another one: ");
    int userInput2 = scanner.nextInt();
    System.out.print("And another one: ");
    int userInput3 = scanner.nextInt();
    System.out.print("Yet another one: ");
    int userInput4 = scanner.nextInt();
    System.out.print("The last one, I promise: ");
    int userInput5 = scanner.nextInt();

    int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
    double average = sum / 5;

    System.out.println("Sum: " + sum + ", Average: " + average);


  }
}
