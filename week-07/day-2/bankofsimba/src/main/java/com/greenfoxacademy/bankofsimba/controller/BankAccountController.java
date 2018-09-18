package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Balance;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {
  BankAccount bankAccount = new BankAccount("Simba", new Balance(2000, "zebra"), "lion");

  @RequestMapping("/show")
  public String greeting(Model model) {
    model.addAttribute("bankaccount", bankAccount);
    return "show";
  }
}
