package main.java.animals;

public class Bird extends Animal {
  public Bird(String name) {
    super(name);
  }

  public Bird(String name, int age, String gender, boolean cuteness){
    super(name, age, gender, cuteness);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
