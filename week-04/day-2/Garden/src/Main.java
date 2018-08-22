import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");

    ArrayList<Plant> garden = new ArrayList<>();
    garden.add(yellow);
    garden.add(blue);
    garden.add(purple);
    garden.add(orange);

    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower) {
        System.out.println(((Flower) garden.get(i)).flowerInfo());
      } else {
        System.out.println(((Tree) garden.get(i)).treeInfo());
      }
    }

    for (int i = 0; i < garden.size(); i++) {
      int allWater = 40;
      int waterPerPlant = allWater / garden.size();
      if (garden.get(i) instanceof Flower) {
        System.out.println(((Flower) garden.get(i)).waterFlower(waterPerPlant));
      } else {
        System.out.println(((Tree) garden.get(i)).waterTree(waterPerPlant));
      }
    }

    for (int i = 0; i < garden.size(); i++) {
      int allWater = 70;
      int waterPerPlant = allWater / garden.size();
      if (garden.get(i) instanceof Flower) {
        System.out.println(((Flower) garden.get(i)).waterFlower(waterPerPlant));
      } else {
        System.out.println(((Tree) garden.get(i)).waterTree(waterPerPlant));
      }
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