package com.greenfoxacademy.foxclub.model;

public class Fox {
  String name;
  Trick trick;
  String food;
  String drink;

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Trick getTrick() {
    return trick;
  }

  public void setTrick(Trick trick) {
    this.trick = trick;
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
}
