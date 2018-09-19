package com.greenfoxacademy.bankofsimba.controller;
import com.greenfoxacademy.bankofsimba.model.Balance;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultipleAccountController {
  @RequestMapping("/multipleaccounts")
  public String multipleAccounts(Model model) {
    BankAccountList bankAccountList = new BankAccountList();
    bankAccountList.add(new BankAccount("Simba", new Balance(2000, "zebra"), "lion", true, false));
    bankAccountList.add(new BankAccount("Scar", new Balance(1500, "hyena"), "lion", true, true));
    bankAccountList.add(new BankAccount("Ed", new Balance(500, "bone"), "hyena", false, true));
    bankAccountList.add(new BankAccount("Zazu", new Balance(300, "worm"), " red-billed hornbill", false, false));
    bankAccountList.add(new BankAccount("Timon/Pumba", new Balance(4000, "insect"), "meerkat/warthog", false, false));

    model.addAttribute("bankaccountlist", bankAccountList.getBankAccountList());
    return "multipleaccounts";
  }
}
