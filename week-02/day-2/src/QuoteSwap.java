import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    System.out.println(quoteSwap(list));

  }

  public static List quoteSwap(ArrayList<String> list) {
    list.add(2, list.get(5));
    list.add(6, list.get(3));
    list.remove(3);
    list.remove(6);
    String string = "";


    return list;
  }
}