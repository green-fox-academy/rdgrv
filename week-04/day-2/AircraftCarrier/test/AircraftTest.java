import org.junit.Test;

import static org.junit.Assert.*;

public class AircraftTest {

  @Test
  public void refillWithNoAmmo() {
    Aircraft f35 = new F35();
    f35.refill(0);
    assertEquals(0, f35.refill(0));
  }

  @Test
  public void refillWithEnoughAmmo() {
    Aircraft f35 = new F35();
    f35.refill(12);
    assertEquals(0, f35.refill(12));
  }

  @Test
  public void refillWithTooMuchAmmo() {
    Aircraft f35 = new F35();
    f35.refill(20);
    assertEquals(8, f35.refill(20));
  }

}