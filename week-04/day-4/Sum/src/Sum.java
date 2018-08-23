import java.util.ArrayList;

public class Sum {

  public int getSum(ArrayList<Integer> arraylist) {
    int sum = 0;
    for (Integer number : arraylist) {
      sum += number;
    }
    return sum;
  }
}