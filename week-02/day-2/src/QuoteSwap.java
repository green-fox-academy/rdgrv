import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    quoteSwap(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }

  public static void quoteSwap(ArrayList list) {
    Collections.swap(list, 2, 5);
  }
}