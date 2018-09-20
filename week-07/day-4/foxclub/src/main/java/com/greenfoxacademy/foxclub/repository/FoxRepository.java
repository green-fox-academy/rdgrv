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
    foxList.add(new Fox("Karak"));
  }

  public List<Fox> getFoxList() {
    return foxList;
  }
}
