import java.util.ArrayList;

public class Farm {
  ArrayList<Animal> farm = new ArrayList<>();
  int farmsize = 5;

  public void breed(Animal animal) {
    if (farm.size() <= farmsize) {
      farm.add(animal);
    } else {
      System.out.println("Farm is already full.");
    }
  }

  public void slaughter() {
    int whoShallIEat = 0;
    for (int i = 1; i < farm.size(); i++) {
      if (farm.get(i).hunger < farm.get(i - 1).hunger) {
        whoShallIEat = i;
      }
    }
    farm.remove(whoShallIEat);
  }
}