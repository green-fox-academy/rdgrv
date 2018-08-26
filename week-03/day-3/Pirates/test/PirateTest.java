import org.junit.Test;

import static org.junit.Assert.*;

public class PirateTest {

  @Test
  public void drinkOneRum() {
    Pirate pirate = new Pirate();
    assertEquals(4, pirate.drinkSomeRum());
  }

  @Test
  public void drinkMultipleRum() {
    Pirate pirate = new Pirate();
    assertEquals(1, pirate.drinkSomeRum(4));
  }

  @Test
  public void howsItGoingWithNonDrunkPirate() {
    Pirate pirate = new Pirate();
    pirate.drinkSomeRum();
    assertEquals("Pour me anudder!", pirate.howsItGoingMate());
  }

  @Test
  public void howsItGoingWithDrunkPirate() {
    Pirate pirate = new Pirate();
    pirate.drinkSomeRum(4);
    assertEquals("Arghh, I'ma Pirate. How d'ya d'ink its goin?", pirate.howsItGoingMate());
  }

  @Test
  public void howsItGoingDeadPirate() {
    Pirate pirate = new Pirate();
    pirate.die();
    assertEquals("He's dead.", pirate.howsItGoingMate());
  }

}