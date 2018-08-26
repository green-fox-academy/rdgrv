package main.java.animals;

public class Mammal extends Animal {
  public Mammal(String name) {
    super(name);
  }

  public Mammal(String name, int age, String gender, boolean cuteness){
    super(name, age, gender, cuteness);
  }

  @Override
  public String breed() {
    return "pushing out small copies.";
  }
}
