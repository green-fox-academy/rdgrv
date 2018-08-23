import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void testWithZero() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(0, fibonacci.fibonacci(0));
  }

  @Test
  public void testWithOne() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(1, fibonacci.fibonacci(1));
  }

  @Test
  public void testWithNumber() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(55, fibonacci.fibonacci(10));
  }
}