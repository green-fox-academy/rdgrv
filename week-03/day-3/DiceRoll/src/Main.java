public class Main {
  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    diceSet.roll();

    for (int i = 0; i < 6; i++) {
      while (diceSet.getCurrent()[i] != 6) {
        diceSet.reroll(i);
      }
      System.out.println(diceSet.getCurrent()[i]);
    }
  }
}


//  You have a DiceSet class which has 6 dices
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to roll the dices until all of the dices are 6
