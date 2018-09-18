package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Balance;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {
  BankAccount bankAccount = new BankAccount("Simba", new Balance(2000, "zebra"), "lion");
  String htmlception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";


  @RequestMapping("/show")
  public String bankaccount(Model model) {
    model.addAttribute("bankaccount", bankAccount);
    return "show";
  }

  @RequestMapping("/htmlception")
  public String htmlception(Model model) {
    model.addAttribute("htmlception", htmlception);
    return "htmlception";
  }
}
