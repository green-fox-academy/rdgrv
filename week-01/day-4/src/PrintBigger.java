import java.util.Scanner;
public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number: ");
    int userInput1 = scanner.nextInt();

    System.out.print("Give me another number: ");
    int userInput2 = scanner.nextInt();

    if (userInput1 > userInput2) {
      System.out.println(userInput1 +" is the bigger one.");
    } else {
      System.out.println(userInput2 + " is the bigger one.");
    }
  }
}
