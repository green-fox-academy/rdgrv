package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @RequestMapping("/")
  public String mainPage() {
    return "index";
  }
}
