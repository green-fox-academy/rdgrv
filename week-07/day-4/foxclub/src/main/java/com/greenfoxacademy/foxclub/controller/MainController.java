package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @RequestMapping("/")
  public String mainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }

    Fox fox = foxService.getFoxByName(name);
    model.addAttribute("foxname", fox.getName());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
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