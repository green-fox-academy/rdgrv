import java.util.Scanner;
public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number: ");
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {
      System.out.println("");
      for (int j = 0 ; j <= i; j++) {
        System.out.print("*");
      }
    }
  }
}
