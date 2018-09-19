package com.greenfoxacademy.diworkshop.controller;

import com.greenfoxacademy.diworkshop.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping("/useful/email")
  public String randomColoredPage(Model model, @RequestParam String email) {
    model.addAttribute("emailvalidation", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    model.addAttribute("valid", "green");
    model.addAttribute("invalid", "red");
    return "email";
  }

  @RequestMapping("/useful/encoder")
  public String encoder(Model model, @RequestParam String text, @RequestParam int number) {
    model.addAttribute("caesar", utilityService.caesar(text, number));
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    return "encoder";
  }

  @RequestMapping("/useful/decoder")
  public String decoder(Model model, @RequestParam String text, @RequestParam int number) {
    model.addAttribute("caesar", utilityService.caesar(text, -number));
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    return "decoder";
  }

}
