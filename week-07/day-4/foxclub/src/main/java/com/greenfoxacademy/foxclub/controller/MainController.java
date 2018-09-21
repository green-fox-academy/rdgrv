package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import com.greenfoxacademy.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @Autowired
  TrickService trickService;

  @RequestMapping("/")
  public String mainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.isEmpty()) {
      return "redirect:/login";
    }

    Fox fox = foxService.getFoxByName(name);
    fox.getKnownTricks().add(trickService.getTrickByName("Java"));
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam(value = "name") String name) {
    return "redirect:/?name=" + name;
  }
}