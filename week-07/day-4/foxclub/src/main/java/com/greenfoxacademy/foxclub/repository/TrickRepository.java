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
  }

  public List<Trick> getTrickList() {
    return trickList;
  }
}
