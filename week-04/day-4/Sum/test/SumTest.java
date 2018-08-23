import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void emptyTest() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    assertEquals(0, sum.getSum(arrayList));
  }

  @Test
  public void oneElementTest() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    assertEquals(1, sum.getSum(arrayList));
  }

  @Test
  public void multipleElementTest() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    assertEquals(3, sum.getSum(arrayList));
  }
}