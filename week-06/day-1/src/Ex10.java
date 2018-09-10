import java.util.ArrayList;

public class Ex10 {
  public static void main(String[] args) {
    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Lala", "alopex", "white"));
    foxes.add(new Fox("Lele", "fulvipes", "green"));
    foxes.add(new Fox("Lili", "vuples", "red"));
    foxes.add(new Fox("Lolo", "pallida", "green"));
    foxes.add(new Fox("Lulu", "pallida", "grey"));

    foxes.stream()
        .filter(f -> f.color.equals("green"))
        .forEach(f -> System.out.println(f.name));

    foxes.stream()
        .filter(f -> f.color.equals("green") && f.type.equals("pallida"))
        .forEach(f -> System.out.println(f.name));
  }
}