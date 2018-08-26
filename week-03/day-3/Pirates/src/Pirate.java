public class Pirate {
  int drumCapacity;
  boolean dead;
  int punchStrength;

  public Pirate() {
    drumCapacity = 5;
    dead = false;
    punchStrength = (int) (Math.random() * 3);
  }

  public int drinkSomeRum() {
    if (drumCapacity > 1) {
      drumCapacity--;
    }
    return drumCapacity;
  }

  public int drinkSomeRum(int rum) {
    if (drumCapacity > 1 && rum < drumCapacity) {
      drumCapacity -= rum;
    }
    return drumCapacity;
  }

  public String howsItGoingMate() {
    if (dead) {
      return "He's dead.";
    } else if (drumCapacity != 1) {
      return "Pour me anudder!";
    } else {
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }
  }

  public String sleepItOff() {
    if (dead) {
      return "He's dead.";
    } else {
      return "*passes out and sleeps it off*";
    }
  }

  public void die() {
    dead = true;
    drumCapacity = 0;
  }

  public String brawl(Pirate otherPirate) {
    if (punchStrength > otherPirate.punchStrength) {
      otherPirate.die();
      return otherPirate + "lost.";
    } else if (punchStrength < otherPirate.punchStrength) {
      die();
      return "I lost.";
    } else {
      sleepItOff();
      otherPirate.sleepItOff();
      return "Both pirates passed out.";
    }
  }
}