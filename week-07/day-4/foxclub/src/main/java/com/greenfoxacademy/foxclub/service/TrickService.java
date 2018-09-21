package com.greenfoxacademy.foxclub.service;
import com.greenfoxacademy.foxclub.model.Trick;
import com.greenfoxacademy.foxclub.repository.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TrickService {

  @Autowired
  TrickRepository trickRepository;

  public TrickRepository getTrickRepository() {
    return trickRepository;
  }

  public Trick getTrickByName(String name) {
    return trickRepository.getTrickList().stream()
        .filter(trick -> trick.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
  }
}
