package com.greenfoxacademy.foxclub.repository;

import com.greenfoxacademy.foxclub.model.Food;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoodRepository {
  List<Food> foodList;

  public FoodRepository() {
    foodList = new ArrayList<>();
    foodList.add(new Food("Veggies only"));
    foodList.add(new Food("Pizza"));
    foodList.add(new Food("Hamburger"));
    foodList.add(new Food("Spaghetti"));
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}