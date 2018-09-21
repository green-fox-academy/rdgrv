package com.greenfoxacademy.foxclub.service;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class FoodService {

  @Autowired
  FoodRepository foodRepository;

  public FoodRepository getFoodRepository() {
    return foodRepository;
  }

  public Food getFoodByName(String food) {
    return foodRepository.getFoodList().stream()
        .filter(f -> f.getName().equals(food))
        .collect(Collectors.toList())
        .get(0);
  }
}

