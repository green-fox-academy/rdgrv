package com.greenfoxacademy.foxclub.model;
import java.util.ArrayList;

public class Fox {
  String name;
  String food;
  String drink;
  ArrayList<Trick> knownTricks;

  public Fox() {
    this("Mr. Green");
  }

  public Fox(String name) {
    this.name = name;
    knownTricks = new ArrayList<Trick>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<Trick> getKnownTricks() {
    return knownTricks;
  }

  public void setKnownTricks(ArrayList<Trick> knownTricks) {
    this.knownTricks = knownTricks;
  }

  public int countTricks() {
    int numberOfTricks = 0;
    for (Trick trick : knownTricks){
      numberOfTricks++;
    }
    return numberOfTricks;
  }
}
