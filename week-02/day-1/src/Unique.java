import java.util.ArrayList;
import java.util.List;

public class Unique {
  public static void main(String[] args) {
    System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
  }

  public static ArrayList<Integer> unique(int[] list) {
    ArrayList<Integer> unique = new ArrayList<>();
    for (int i = 0; i < list.length; i++) {
      if (!unique.contains(list[i])) {
        unique.add(list[i]);
      }
    }
    return unique;
  }
}