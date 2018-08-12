import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please give me a word and I will create a palindrome for you: ");

    String word = scanner.nextLine();
    String palindrome = word;

    for (int i = 0; i < word.length(); i++) {
      palindrome = palindrome + word.charAt(word.length() - i - 1);
    }
    System.out.println(palindrome);
  }
}