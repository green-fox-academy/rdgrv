public class Flower extends Plant {

  public Flower(String color) {
    super(color);
  }

  public String waterFlower(int water) {
    if (waterLevel < 5) {
      waterLevel += water * 0.75;
    }
    return flowerInfo();
  }

  public String flowerInfo() {
    if (waterLevel < 5) {
      return "The " + color + " Flower needs water";
    } else {
      return "The " + color + " Flower doesn't need water";
    }
  }
}

//  The Garden
//  is able to hold unlimited amount of flowers or trees
//  when watering it should only water those what needs water with equally divided amount amongst them
//  eg. watering with 40 and 4 of them need water then each gets watered with 10
//    The Flower
//    needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5
//    The Tree
//    needs water if its current water amount is less then 10
//    when watering it the tree can only absorb the 40% of the water
//    eg. watering with 10 the tree's amount of water should only increase with 4