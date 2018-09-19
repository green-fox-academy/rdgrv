package com.greenfoxacademy.diworkshop.controller;

import com.greenfoxacademy.diworkshop.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String mainPage() {

    return "useful";
  }

  @RequestMapping("/useful/colored")
  public String randomColoredPage(Model model) {
    model.addAttribute("background", utilityService.randomColor());
    return "colored";
  }
}
