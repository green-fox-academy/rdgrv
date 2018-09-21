package com.greenfoxacademy.foxclub.repository;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DrinkRepository {
  List<Drink> drinkList;

  public DrinkRepository() {
    drinkList = new ArrayList<>();
    drinkList.add(new Drink("Water"));
    drinkList.add(new Drink("Cola"));
    drinkList.add(new Drink("Beer"));
    drinkList.add(new Drink("Juice"));
  }

  public List<Drink> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<Drink> drinkList) {
    this.drinkList = drinkList;
  }
}