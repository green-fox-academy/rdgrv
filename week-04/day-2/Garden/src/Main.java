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
      System.out.println(plant);
    }

    System.out.println("\nWatering with 40");

    for (Plant plant : garden) {
      allWater = 40;
      plant.water(allWater / garden.size());
      System.out.println(plant);
    }

    System.out.println("\nWatering with 70");

    for (Plant plant : garden) {
      allWater = 70;
      plant.water(allWater / garden.size());
      System.out.println(plant);
    }
  }
}