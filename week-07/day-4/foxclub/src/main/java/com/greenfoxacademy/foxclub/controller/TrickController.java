package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TrickController {

  @Autowired
  TrickService trickService;
}
