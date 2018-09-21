package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {

  @Autowired
  FoxRepository foxRepository;

  public Fox getFoxByName(String name) {
    return foxRepository.getFoxList().stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
  }

  public void addFox(Fox fox) {
    foxRepository.getFoxList().add(fox);
  }
}