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

    int allWater;

    for (Plant plant : garden) {
      System.out.println(plant.info());

      allWater = 40;
      plant.water(allWater / garden.size());
      System.out.println(plant.info());

      allWater = 70;
      plant.water(allWater / garden.size());
      System.out.println(plant.info());
    }
  }
}