public class Pirate {
  int drumCapacity;

  public Pirate() {
    drumCapacity = 5;
  }

  public int drinkSomeRum() {
    if (drumCapacity != 1) {
      drumCapacity--;
    }
    return drumCapacity;
  }

  public int drinkSomeRum(int rum) {
    if (drumCapacity != 1 && rum < drumCapacity) {
      drumCapacity-= rum;
    }
    return drumCapacity;
  }

  public String howsItGoingMate() {
    if (drumCapacity != 1) {
      return "Pour me anudder!";
    } else {
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }
  }

  public String sleepItOff() {
    return "*passes out and sleeps it off*";
  }
}


//    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//    And... if you get that far...
//
//    Add a parrot.
//
//    The Pirate Ship
//    The place for the Pirates
//
//    Create a Ship class.
//    The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//    When a ship is created it doesn't have a crew or a captain.
//    The ship can be filled with pirates and a captain via fillShip() method.
//    Filling the ship with a captain and random number of pirates.
//    Ships should be represented in a nice way on command line including information about
//    captains consumed rum, state (passed out / died)
//    number of alive pirates in the crew
//    Ships should have a method to battle other ships: ship.battle(otherShip)
//    should return true if the actual ship (this) wins
//    the ship should win if its calculated score is higher
//    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//    The loser crew has a random number of losses (deaths).
//    The winner captain and crew has a party, including a random number of rum :)
//    BattleApp
//    Create a BattleApp class with a main method
//    Create 2 ships, fill them with pirates
//    Have a battle!
//    Armada
//    Create an Armada class
//Contains Ship-s as a list
//    Have a armada.war(otherArmada) method where two armada can engage in war
//    it should work like merge sort
//    first ship from the first armada battles the first of the other
//    the loser gets skipped so the next ship comes in play from that armada
//    whichever armada gets to the end of its ships loses the war
//    return true if this is the winner
//    WarApp
//    Create a WarApp class with a main method
//    Create 2 armadas, fill them with ships
//    Have a war!