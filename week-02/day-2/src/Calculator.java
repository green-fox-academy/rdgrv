import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please give me an operator and an operand, and I'm gonna do the math for you: ");

    String operation = scanner.next();
    int op1 = Integer.parseInt(scanner.next());
    int op2 = Integer.parseInt(scanner.next());
    calculate(operation, op1, op2);
  }

  public static void calculate(String operation, int op1, int op2) {
    int total;
    switch (operation) {
      case "+":
        total = op1 + op2;
        System.out.println(total);
        break;
      case "-":
        total = op1 - op2;
        System.out.println(total);
        break;
      case "/":
        total = op1 / op2;
        System.out.println(total);
        break;
      case "*":
        total = op1 * op2;
        System.out.println(total);
        break;
      case "%":
        total = op1 % op2;
        System.out.println(total);
        break;
    }
  }
}