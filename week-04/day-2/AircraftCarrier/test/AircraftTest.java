import org.junit.Test;

import static org.junit.Assert.*;

public class AircraftTest {

  @Test
  public void fightTest() {
    Aircraft f35 = new F35();
    assertEquals(600, f35.fight());
  }

  @Test
  public void refillWithNoAmmo() {
    Aircraft f35 = new F35();
    assertEquals(0, f35.refill(0));
  }

  @Test
  public void refillWithEnoughAmmo() {
    Aircraft f35 = new F35();
    assertEquals(0, f35.refill(12));
  }

  @Test
  public void refillWithTooMuchAmmo() {
    Aircraft f35 = new F35();
    assertEquals(8, f35.refill(20));
  }

  @Test
  public void typeTest() {
    Aircraft f35 = new F35();
    assertEquals("F35", f35.getType());
  }

  @Test
  public void statusTest() {
    Aircraft f35 = new F35();
    assertEquals("Type F35, Ammo: 0, Base Damage: 50, All Damage: 600", f35.getStatus());
  }

}