public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    quote = quote.substring(0, 21) + "always takes longer than " + quote.substring(21);

    System.out.println(quote);

    String quote2 = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    StringBuilder newString = new StringBuilder(quote2);
    newString.insert(quote2.indexOf("you"), "always takes longer than ");

    System.out.println(newString);
  }
}