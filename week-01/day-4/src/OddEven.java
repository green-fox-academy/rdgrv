import java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me a number and I will tell you whether it is odd or even: ");
    int userInput1 = scanner.nextInt();

    if (userInput1 % 2 == 0){
      System.out.println("This number is even.");
    } else {
      System.out.println("This number is odd.");
    }
  }
}
