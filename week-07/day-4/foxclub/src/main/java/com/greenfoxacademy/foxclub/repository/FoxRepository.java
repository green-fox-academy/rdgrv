package com.greenfoxacademy.foxclub.repository;

import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxRepository {
  List<Fox> foxList;

  public FoxRepository() {
    foxList = new ArrayList<>();
    foxList.add(new Fox("Vuk"));
    foxList.get(0).setFood("pizza");
    foxList.get(0).setDrink("cola");
    foxList.add(new Fox("Karak"));
    foxList.get(1).setFood("spaghetti");
    foxList.get(1).setDrink("water");
  }

  public List<Fox> getFoxList() {
    return foxList;
  }
}
