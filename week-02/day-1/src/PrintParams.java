public class PrintParams {
  public static void main(String[] args) {
    printParams("hello", "goodbye", "yay", "nay");

  }

  public static void printParams(String... a) {

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...