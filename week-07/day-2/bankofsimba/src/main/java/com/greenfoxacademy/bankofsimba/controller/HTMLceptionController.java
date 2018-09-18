package com.greenfoxacademy.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLceptionController {
  String htmlception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  @RequestMapping("/htmlception")
  public String htmlception(Model model) {
    model.addAttribute("htmlception", htmlception);
    return "htmlception";
  }
}
