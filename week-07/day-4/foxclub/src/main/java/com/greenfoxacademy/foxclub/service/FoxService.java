package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {
  FoxRepository foxRepository;

  @Autowired
  public FoxService(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public void add(Fox fox) {
    foxRepository.getFoxList().add(fox);
  }

  public List<Fox> getFoxList() {
    return foxRepository.getFoxList();
  }

  public Fox getFoxByName(String name) {
    return foxRepository.getFoxList().stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
  }
}