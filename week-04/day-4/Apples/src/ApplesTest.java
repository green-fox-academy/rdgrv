import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
  public void checkString() {
    Apples apple = new Apples();
    assertEquals("apple", apple.getApple());
  }
}