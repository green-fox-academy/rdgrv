package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DrinkService {

  @Autowired
  DrinkRepository drinkRepository;

  public DrinkRepository getDrinkRepository() {
    return drinkRepository;
  }

  public Drink getDrinkByName(String drink) {
    return drinkRepository.getDrinkList().stream()
        .filter(d -> d.getName().equals(drink))
        .collect(Collectors.toList())
        .get(0);
  }
}

