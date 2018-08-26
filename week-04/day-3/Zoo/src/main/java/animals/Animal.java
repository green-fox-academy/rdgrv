package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  boolean cuteness;

  public Animal(String name) {
    this.name = name;
  }

  public Animal(String name, int age, String gender, boolean cuteness) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.cuteness = cuteness;
  }

  abstract String breed();

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public boolean isItCute() {
    return cuteness;
  }
}
