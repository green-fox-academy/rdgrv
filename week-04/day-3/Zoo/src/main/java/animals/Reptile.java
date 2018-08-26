package main.java.animals;

public class Reptile extends Animal {
  public Reptile (String name) {
    super(name);
  }

  public Reptile(String name, int age, String gender, boolean cuteness){
    super(name, age, gender, cuteness);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
