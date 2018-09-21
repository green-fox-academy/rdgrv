package com.greenfoxacademy.foxclub.repository;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Trick;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TrickRepository {
  List<Trick> trickList;

  public TrickRepository() {
    trickList = new ArrayList<>();
    trickList.add(new Trick("Java"));
    trickList.add(new Trick("JavaScript"));
    trickList.add(new Trick("HTML5 + CSS"));
    trickList.add(new Trick("Python"));
    trickList.add(new Trick("C#"));
  }

  public List<Trick> getTrickList() {
    return trickList;
  }
}
